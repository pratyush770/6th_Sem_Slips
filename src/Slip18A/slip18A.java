class First
{
    public First()
    {}
    synchronized public void numbers()
    {
        try
        {
            System.out.println("Method and Thread started");
            for(int i=1;i<=10;i++)
            {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Method and Thread completed");
    }
}
class MyThread3 extends Thread
{
    First f;
    public MyThread3(First ob)
    {
        f=ob;
        start();
    }

    @Override
    public void run()
    {
        try
        {
            f.numbers();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class slip18A
{
    public static void main(String[] args) throws Exception
    {
        First fob = new First();
        MyThread3 ob1 = new MyThread3(fob);
        MyThread3 ob2 = new MyThread3(fob);
        ob1.join();
        ob2.join();
    }
}
