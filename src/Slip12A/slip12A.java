import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class slip12A extends JFrame implements Runnable, ActionListener
{
    Thread t = null;
    JTextField tf;
    JButton b;
    slip12A()
    {
        t = new Thread(this);
        tf = new JTextField(20);
        b = new JButton("Display");
        Font f = new Font("Arial",Font.BOLD,20);
        setFont(f);
        add(tf);
        add(b);
        b.addActionListener(this);
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            t.start();
        }
    }
    public static void main(String[] args)
    {
        slip12A ob = new slip12A();
    }

    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=100;i++)
            {
                tf.setText(String.valueOf(i) + "\n");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}