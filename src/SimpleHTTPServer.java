import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class SimpleHTTPServer{
    
    public static void main(String[] args) throws IOException {
        /*
         * Java program which creates a HTTP server that allows the user to connect to 
         */
        final ServerSocket server = new ServerSocket(8000);
        System.out.println("Listening for connection on port 8000....");
        while (true) {
            
            /*
             * 1. Read HTTP request from the client socket
             * 2. Prepare an HTTP response
             * 3. Send HTTP response to client
             * 4. Close the socket
             */

             try (Socket client = server.accept()){
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                client.getOutputStream()
                .write(httpResponse.getBytes("UTF-8"));
             } catch (Exception e) {
                // TODO: handle exception
             }
             }
            // spin forever
        }
        
    }