import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static final int PORT = 8100;
    public static void main ( String [] args ) throws IOException {
        Server s = new Server(PORT);
    }
}