import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RunnableDemo extends JFrame implements ActionListener,Runnable
{
    JTextField t1;
    JLabel l1;
    JButton b1;
    String s;
    char ch;
    Thread t=null;
    Container c;
    JPanel p1,p2;
    public RunnableDemo()
    {
        t1 = new JTextField(15);
        l1 = new JLabel("Enter a string to convert in uppercase : ");
        b1 = new JButton("Display");
        t = new Thread(this);
        p1 = new JPanel();
        p2 = new JPanel();
        c = getContentPane();
        b1.addActionListener(this);
        p1.add(l1);p1.add(t1);
        p2.add(b1);
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,1));
        c.add(p1);
        c.add(p2);
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(2,1));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t.start();
        }
    }

    @Override
    public void run()
    {
        s = t1.getText().toString();
        s = s.toUpperCase();
        l1.setText("The entered text in uppercase is : ");
        t1.setText(s);
    }
    public static void main(String[] args)
    {
        RunnableDemo ob = new RunnableDemo();
    }
}
