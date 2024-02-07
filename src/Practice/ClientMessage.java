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
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the message : ");
            String msg = sc.nextLine();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            pw.println(msg);
            System.out.println("Message sent to server...");
            pw.flush();
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
