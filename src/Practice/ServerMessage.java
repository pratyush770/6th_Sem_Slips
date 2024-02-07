import java.io.*;
import java.net.*;
public class ServerMessage
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Waiting for message from client...");
            Socket socket = serverSocket.accept();
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = bf.readLine();
            String upper = msg.toUpperCase();
            System.out.println("The message received from client in uppercase is : " + upper);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
