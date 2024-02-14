import java.net.*;
import java.util.*;
import java.io.*;
public class ClientFactorial
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("localhost",1234);
            System.out.println("Starting connection...");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            String n = sc.next();
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("The entered number is : " + n);
            pw.println(n);
            System.out.println("Input sent to server...");
            System.out.println();
            String fact = buf.readLine();
            System.out.println("The factorial of the number is : " + fact);
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
