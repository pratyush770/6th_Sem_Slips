import java.awt.*;
import java.io.*;
import java.applet.*;

public class slip3B extends Applet implements Runnable
{
    Thread t = null;
    int f=0;

    @Override
    public void init() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                Thread.sleep(800);
                repaint();
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g)
    {
        Color bl = Color.BLACK;
        g.setColor(bl);
        g.drawRect(220,100,60,180);
        g.drawOval(220,100,60,60);
        g.drawOval(220,160,60,60);
        g.drawOval(220,220,60,60);
        if(f==0)
        {
            Color r = Color.RED;
            g.setColor(r);
            g.fillOval(220,100,60,60);
            f=1;
        }
        else if(f==1)
        {
            Color y = Color.YELLOW;
            g.setColor(y);
            g.fillOval(220,160,60,60);
            f=2;
        }
        else if(f==2)
        {
            Color gr = Color.GREEN;
            g.setColor(gr);
            g.fillOval(220,220,60,60);
            f=0;
        }
    }
}
/*
<applet code="slip3B" height="500" width="500">
</applet>
 */
