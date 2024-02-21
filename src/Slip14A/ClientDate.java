import java.io.*;
import java.net.*;
public class ClientDate
{
    public static void main(String[] args) throws Exception
    {
        Socket socket = new Socket("localhost",1234);
        System.out.println("Connection Started...");
        BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg = buf.readLine();
        System.out.println(msg);
        buf.close();
        socket.close();
    }
}
