import java.net.*;
import java.io.*;
import java.sql.SQLException;

public class Server {

    public static void main(String[] ar) {
        int port = 9999;
        try (ServerSocket ss = new ServerSocket(port)){

            while(true) {
                System.out.println("Waiting for a client...");
                new ServerThr(ss.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("error " + port);
            System.exit(-1);
        }
    }
}