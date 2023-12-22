import java.applet.*;
import java.awt.*;
public class slip7B extends Applet implements Runnable
{
    Image i,i1;
    int x = 10,x1 = 10;
    Thread t = null;
    @Override
    public void init()
    {
        t = new Thread(this);
        i = getImage(getDocumentBase(),"car.png");
        i1 = getImage(getDocumentBase(),"car1.png");
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                if(x<=780)
                {
                    x = x+30;
                    x1 = x1+25;
                    Thread.sleep(500);
                }
                else
                {
                    wait();
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
        g.drawImage(i1,x,30,this);
        g.drawImage(i,x1,180,this);
    }
}
/*
<html>
<applet code = "slip7B" height="400" width="800">
</applet>
</html>
 */
