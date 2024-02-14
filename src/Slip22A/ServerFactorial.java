import java.net.*;
import java.io.*;
public class ServerFactorial
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Waiting for input from client...");
            System.out.println();
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            String num = br.readLine();
            int n = Integer.parseInt(num);
            System.out.println("The received number from client is : " + n);
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("The factorial of the number is : " + fact);
            pw.println(fact);
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
