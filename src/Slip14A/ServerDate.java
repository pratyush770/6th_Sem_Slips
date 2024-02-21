import java.net.*;
import java.io.*;
import java.util.Date;

public class ServerDate
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Connection Started...");
        Socket socket = serverSocket.accept();
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        Date d = new Date();
        String msg = "The date and time from server machine is : " + d;
        pw.println(msg);
        pw.close();
        socket.close();
    }
}
