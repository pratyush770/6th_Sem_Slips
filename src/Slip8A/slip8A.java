import javax.swing.*;
import java.awt.*;

public class slip8A extends JFrame implements Runnable
{
    Thread t;
    JLabel l;
    slip8A()
    {
        t = new Thread(this);
        l = new JLabel("");
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            setVisible(true);
            setLayout(new FlowLayout());
            setSize(400,400);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setTitle("SLIP8A");
            setLocation(800,300);
            l.setFont(new Font("Arial",Font.BOLD,28));
            add(l);
            while(true)
            {
                l.setText("Welcome");
                Thread.sleep(700);
                l.setText("");
                Thread.sleep(700);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        slip8A ob = new slip8A();
    }
}
