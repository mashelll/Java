import java.io.*;
import java.net.Socket;

public class Client {

    static class Order implements Serializable {
        private final String name;
        private final int price;

        Order(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main (String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Client start");
        Socket socket = new Socket("localhost", 14996);
        System.out.println("Client connected");
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        Order message = new Order("Hello",12);
        os.writeObject(message);
        System.out.println("send to server...");

        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
        Order returnMessage = (Order) is.readObject();
        System.out.println("return Order is=" + returnMessage);
        socket.close();
    }
}