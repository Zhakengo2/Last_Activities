package Task5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        Scanner input = new Scanner(new InputStreamReader(socket.getInputStream()));
        System.out.println(input.nextLine());
    }
}
