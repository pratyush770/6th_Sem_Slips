import java.applet.Applet;
import java.awt.*;
public class ThreadLineDemo extends Applet implements Runnable
{
    int x = 0;
    Thread t;

    @Override
    public void init() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try
        {
            while(true)
            {
                if(x<=640)
                {
                    x = x+20;  // moves forward
                    Thread.sleep(200);
                }
                else
                {
                    x=0;
                }
                repaint();  // calls the paint method again
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void paint(Graphics g)
    {
        Color c = Color.RED;
        g.setColor(c);
//        g.drawString("Pratyush",x,70);
        g.fillRect(20,70,x,70);
    }
}
/*
<html>
<applet code="ThreadLineDemo" height="300" width="700">
</applet>
</html>
 */
