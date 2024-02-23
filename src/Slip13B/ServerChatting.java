import java.io.*;
import java.net.*;
import java.util.*;
public class ServerChatting
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket socket = serverSocket.accept();
            BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            String ans = "";
            String msg = "";
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                msg = buf.readLine();
                if(msg.equalsIgnoreCase("end"))
                {
                    break;
                }
                else
                {
                    System.out.println(msg);
                    System.out.print("Enter the message : " );
                    ans = sc.nextLine();
                    pw.println(ans);
                }
            }
            sc.close();
            pw.close();
            buf.close();
            socket.close();
            serverSocket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
