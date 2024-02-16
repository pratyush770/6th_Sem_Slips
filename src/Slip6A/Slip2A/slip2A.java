//package Slip2A;
import java.util.*;
class MyThread1 extends Thread
{
    String s1;
    MyThread1(String s)
    {
        s1 = s;
        start();
    }
    @Override
    public void run()
    {
        int i;
        System.out.print("The vowels are : ");
        for(i=0;i< s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.print(" " + ch);
            }
        }
    }
}
public class slip2A
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.next();
        MyThread1 ob = new MyThread1(s);
    }
}
