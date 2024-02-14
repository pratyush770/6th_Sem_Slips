import java.net.*;
 import java.util.*;
 import java.io.*;
public class ClientMessage
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("localhost",1234);
            System.out.println("Starting connection...");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the message : ");
            String msg = sc.nextLine();
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("The entered message is : " + msg);
            pw.println(msg);
            System.out.println("Message sent to server...");
            System.out.println();
            String message = buf.readLine();
            System.out.println("The message received from server in uppercase is : " + message);
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
