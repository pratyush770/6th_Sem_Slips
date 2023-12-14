//package Slip17A;
public class slip17A
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("The name of the thread is : " + t.getName());
        System.out.println("The priority of the thread is : " + t.getPriority());
        t.setName("MyThread");
        t.setPriority(2);
        System.out.println("The details of thread are as follows : " + t);
    }
}
