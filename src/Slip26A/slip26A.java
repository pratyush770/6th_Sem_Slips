//package Slip26A;
class slip26Thread extends Thread
{
    slip26Thread()
    {
        start();
    }

    @Override
    public void run()
    {
        try
        {
            char ch ;
            for(ch='A';ch<='Z';ch++)
            {
                System.out.println("\t" + ch);
                Thread.sleep(3000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class slip26A
{
    public static void main(String[] args)
    {
        slip26Thread ob = new slip26Thread();
    }
}
