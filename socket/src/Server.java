import java.net.ServerSocket;
import java.sql.SQLOutput;

/**
 *  Twitter Server Demo
 */
public class Server {
    /**
     * Running in the server
     * 1. apply port number from system
     * 2. Listen on port, server socket instant will be created when client connect
     *    with server through this port
     */
    private ServerSocket server;

    public Server() {
        try {
            /**
             * To request 8088 as server port num from system.
             */
            System.out.println("Start the server...");
            server = new ServerSocket(8088);
            System.out.println("The server is started");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            /**
             * Listens for a connection to be made to this socket and accepts it.
             * The method blocks until a connection is made.
             */
            System.out.println("Waiting for client connect to server...");
            server.accept();
            System.out.println("A client connect to server.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
