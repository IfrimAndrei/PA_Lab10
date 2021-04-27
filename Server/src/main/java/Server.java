import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static boolean serverState = true;

    public Server(int PORT) throws IOException {
        ServerSocket serverSocket = null ;

        try {
            serverSocket = new ServerSocket(PORT);

            while (serverState) {
                System.out.println ("Waiting for a client ...");
                Socket socket = serverSocket.accept();
                if(serverState)
                    new ClientThread(socket).start();
            }

            System.out.println("Server stopped");

        } catch (IOException e) {
            System.err. println ("Ooops... " + e);
        } finally {
            serverSocket.close();
        }
    }
}
