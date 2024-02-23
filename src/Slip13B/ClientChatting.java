import java.io.*;
import java.util.*;
import java.net.*;
public class ClientChatting
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("localhost",1234);
            BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            String ans = "";
            String msg = "";
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                System.out.print("Enter the message : ");
                ans = sc.nextLine();
                if(ans.equalsIgnoreCase("end"))
                {
                    pw.println(ans);
                    break;
                }
                else
                {
                    pw.println(ans);
                }
                msg = buf.readLine();
                System.out.println(msg);
            }
            sc.close();
            pw.close();
            buf.close();
            socket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
