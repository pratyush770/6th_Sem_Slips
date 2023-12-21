import java.applet.*;
import java.awt.*;
public class slip9B extends Applet implements Runnable
{
    Thread t = null;
    int y = 10,f=0;

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
            while(true) {
                if (f == 0) {
                    while (y < 460) {
                        y = y + 10;
                        Thread.sleep(100);
                        repaint();
                    }
                }
                else if (f == 1)
                {
                    while (y > 0)
                    {
                        y = y - 10;
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
<applet code="slip9B" height="500" width="400">
</applet>
 */
