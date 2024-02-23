import java.net.*;
public class slip1A
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress ip  = InetAddress.getLocalHost();
            System.out.println("The IP address of the client is : " + ip.getHostAddress());
            System.out.println("The name of the client machine is : " + ip.getHostName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
