import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER = "localhost";
        final int PORT = 12345;

        try (Socket socket = new Socket(SERVER, PORT);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            Thread readThread = new Thread(() -> {
                String serverMsg;
                try {
                    while ((serverMsg = input.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });
            readThread.start();

            String userInput;
            while ((userInput = consoleInput.readLine()) != null) {
                output.println(userInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
