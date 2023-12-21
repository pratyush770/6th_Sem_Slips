import java.applet.*;
import java.awt.*;
import java.util.*;
public class slip10B extends Applet implements Runnable
{
    Thread t = null;
    int y=10,f=0,r=0,g=0,b=0;
    Color c;
    public void init()
    {
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
                if(f==0)
                {
                    Random random = new Random();
                    r = random.nextInt(255);
                    random = new Random();
                    g = random.nextInt(255);
                    random = new Random();
                    b = random.nextInt(255);
                    c = new Color(r,g,b);
                    while(y<460)
                    {
                        y=y+10;
                        Thread.sleep(100);
                        repaint();
                    }
                }
                else if(f==1)
                {
                    Random random = new Random();
                    r = random.nextInt(255);
                    random = new Random();
                    g = random.nextInt(255);
                    random = new Random();
                    b = random.nextInt(255);
                    c = new Color(r,g,b);
                    while(y>0)
                    {
                        y=y-10;
                        Thread.sleep(100);
                        repaint();
                    }
                }
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
        g.setColor(c);
        g.fillOval(170,y,50,50);
        if(f==0)
        {
            f=1;
        }
        else if(f==1)
        {
            f=0;
        }
    }
}
/*
<html>
<applet code ="slip10B" width="400" height="500">
</applet>
 */
