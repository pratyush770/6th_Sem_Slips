//package Slip27B;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
public class slip27B extends Applet implements ActionListener,Runnable
{
    Thread t = null;
    TextField t1;
    Button b1,b2;
    Date d;
    public void init()
    {
        try
        {
            t = new Thread(this);
            t.start();
            t.suspend();
            t1 = new TextField(15);
            b1 = new Button("Start");
            b2 = new Button("Stop");
            b1.addActionListener(this);
            b2.addActionListener(this);
            add(t1);
            add(b1);add(b2);
            setLayout(new FlowLayout());
            setVisible(true);
            setSize(500,500);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                Date d = new Date();
                int hh = d.getHours();
                int mm = d.getMinutes();
                int ss = d.getSeconds();
                t1.setText("" + hh + ":" + mm + ":" + ss);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent a)
    {
        try
        {
            if (a.getSource() == b1)
                {
                   t.resume();
                }
                if (a.getSource() == b2)
                {
                    t.suspend();
                }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
/*
<html>
<applet code = "slip27B" height="300" width="300">
</applet>
</html>
*/

