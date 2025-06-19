import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    private Set<ClientHandler> clients;
    private String userName;

    public ClientHandler(Socket socket, Set<ClientHandler> clients) {
        this.socket = socket;
        this.clients = clients;
        try {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            output.println("Enter username:");
            userName = input.readLine();
            broadcastMessage(" " + userName + " joined the chat.");

            String message;
            while ((message = input.readLine()) != null) {
                String formatted = userName + ": " + message;
                broadcastMessage(formatted);
            }
        } catch (IOException e) {
            System.out.println(userName + " disconnected.");
        } finally {
            try {
                clients.remove(this);
                broadcastMessage("" + userName + " left the chat.");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void broadcastMessage(String message) {
        String timestamp = new SimpleDateFormat("hh:mm a").format(new Date());
        String timeStampedMessage = "[" + timestamp + "] " + message;

        for (ClientHandler client : clients) {
            client.output.println(timeStampedMessage);
        }

        ChatServer.logMessage(timeStampedMessage); 
    }
}
