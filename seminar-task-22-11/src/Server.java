import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(14996);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Started");

            new Thread(() -> {
                try {
                    process(clientSocket);
                } catch(IOException e) {
                    try {
                        clientSocket.close();
                    } catch(IOException ignore) {
                    }
                }
            }).start();
        }
    }

    private static void process(Socket clientSocket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println((reader.readLine()));
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
        writer.println("End");
        writer.flush();
        clientSocket.close();
    }
}
