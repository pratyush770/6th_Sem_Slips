import java.util.*;
class MyThread4 extends Thread
{
    String n;
    MyThread4(String n)
    {
        this.n = n;
        start();
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(1000);  // will invoke after every 1 sec
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            setName(n);  // sets the name of the thread
            System.out.println("The name of the thread is : " + this.getName());  // prints the name
            Random random = new Random();
            int s = random.nextInt(5000);  // generates random value
            System.out.println(this.getName() + " is sleeping for " + s + " seconds");
            try
            {
                Thread.sleep(s);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class slip16B
{
    public static void main(String[] args)
    {
        MyThread4 ob1 = new MyThread4("Pratyush");
        MyThread4 ob2 = new MyThread4("Prayushi");
        try
        {
            ob1.join();
            ob2.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
