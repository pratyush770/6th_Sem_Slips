import java.net.*;
import java.io.*;
public class ServerFile
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Waiting for input from client...");
        while(true)
        {
            Socket socket = serverSocket.accept();
            BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = buf.readLine();
            System.out.println("Input received from client...");
            System.out.println("The name of the file received from client is : " + msg);
            File f = new File(msg);
            System.out.println("File found : " + f.exists());
            FileReader fileReader = new FileReader(f);
            int data = 0;
            char ch;
            String str = "";
            while(data!=-1)
            {
                data = fileReader.read();
                if(data!=-1)
                {
                    ch = (char)data;
                    str = str + Character.toString(ch);
                }

            }
            System.out.println(str);
            fileReader.close();
            buf.close();
            socket.close();
            System.exit(0);
        }
    }
}
