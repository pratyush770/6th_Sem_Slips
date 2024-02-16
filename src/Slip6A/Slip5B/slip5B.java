import java.applet.*;
import java.awt.*;
public class slip5B extends Applet implements Runnable
{
    Thread t = null;
    int x = 10,f=0;
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
                if(f==0)
                {
                    while(x<460)
                    {
                        x=x+10;
                        Thread.sleep(100);
                        repaint();
                    }
                }
                else if(f==1)
                {
                    while(x>0)
                    {
                        x=x-10;
                        Thread.sleep(100);
                        repaint();
                    }
                }
                repaint();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g)
    {
        g.fillOval(x,200,50,50);
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
<applet code = "slip5B" height="500" width="500">
</applet>
 */
