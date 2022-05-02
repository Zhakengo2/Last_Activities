package Task5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static int clientNum = 0;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        while (true){

            System.out.println("waiting for Client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client #" + clientNum + " Connected");
            clientNum++;
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println("Your are Client #" + clientNum);
            out.flush();
            socket.close();
            serverSocket.close();
        }
    }
}