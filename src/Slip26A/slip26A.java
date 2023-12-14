package Slip26A;
public class slip26A
{
    public static void main(String[] args)
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
