import java.applet.*;
import java.awt.*;
public class slip19B extends Applet implements Runnable
{
    Thread t = null;
    int f=0;
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
            while (true)
            {
                Thread.sleep(5000);
                repaint();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g)
    {
        Color c = Color.BLACK;
        g.setColor(c);
        g.drawOval(100,100,300,300);
        g.fillOval(150,150,40,40);
        g.fillOval(300,150,40,40);
        if(f==0)
        {
            g.drawArc(150,150,200,200,180,180);
            f=1;
        }
        else if(f==1)
        {
            g.drawArc(150,230,200,200,360,180);
            f=0;
        }
    }
}
/*
<applet code="slip19B" height="500" width="500">
</applet>
 */

