import java.net.*;
import java.io.*;
import java.util.*;
public class ClientFile
{
    public static void main(String[] args) throws Exception
    {
        Socket socket = new Socket("localhost",1234);
        System.out.println("Connection started...");
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file : ");
        String name = sc.nextLine();
        pw.println(name);
        System.out.println("Input sent to server...");
        sc.close();
        socket.close();
    }
}
