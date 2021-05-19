import org.w3c.dom.ls.LSOutput;

import java.net.Socket;

/**
 *  Twitter Client Demo
 */
public class Client {
    /**
     *  java.net.Socket
     *  TCP layer details are encapsulated in the socket class
     *  InputStream and OutputStream are used to establish connection with other pc
     *  and exchange data.
     */
    private Socket socket;

    /**
     * Constructor initialize client
     */
    public Client() {
        try {
            /*
             * host: ip address;
             * port: port number;
             * Find pc through host and find app by port number
             * The instantiation of socket is the process to connect
             */
            System.out.println("connecting to server...");
            socket = new Socket("localhost",8088);
            System.out.println("Connected to server!");
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    /**
     *  Program start method
     */
    public void start() {

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }


}
