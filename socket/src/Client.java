import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *  Twitter Client Demo
 */
public class Client {
    /**
     *  java.net.Socket
     *  TCP layer details are encapsulated in the socket class
     *  GetInputStream and GetOutputStream are used to establish connection with other pc
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
        try{
            /**
             * Socket : OutputStream getOutputStream() ----Byte stream
             * return a outputStream, data will transfer to server through outputStream
             * PW -> BW -> OSW -> Out
             * autoflush    convert to characters
             *
             * BR - ISR - IN
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);
            Scanner kb = new Scanner(System.in);
            String line = null;
            while (true) {
                line = kb.nextLine();
                pw.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }


}
