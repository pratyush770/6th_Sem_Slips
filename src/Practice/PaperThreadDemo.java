// important question from exam point of view
class MyThread extends Thread
{
    String t;  // global variables
    int n;
    MyThread(String text,int num)  // arguments
    {
        t=text;
        n=num;
        start();
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Thread started");
            for(int i=1;i<=n;i++)
            {
                System.out.println("\t" + t);
                Thread.sleep(500);
            }
            System.out.println("Thread completed");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class PaperThreadDemo
{
    public static void main(String[] args) throws Exception
    {
        MyThread ob = new MyThread(args[0],Integer.parseInt(args[1]));
        MyThread ob1 = new MyThread(args[2],Integer.parseInt(args[3]));
        System.out.println("Main started");
        ob.join();
        ob1.join();
        System.out.println("Main completed");
    }
}
