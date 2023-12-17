import java.util.*;
class MyThread2 extends Thread
{
    int n1;
    MyThread2(int n)
    {
        n1 = n;
        start();
    }
    @Override
    public void run()
    {
        try
        {
            int i;
            for(i=0;i<n1;i++)
            {
                System.out.println("Hello Java");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

public class slip4A
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to execute : ");
        int n = sc.nextInt();
        MyThread2 ob = new MyThread2(n);

    }
}
