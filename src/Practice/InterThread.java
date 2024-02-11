class Customer
{
    int amount = 10000;
    synchronized void withdraw(int amount)
    {
        System.out.println("Starting withdraw transaction");
        if(this.amount<amount)
        {
            System.out.println("Less balance, waiting for deposit!!");
            try
            {
                wait();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        this.amount-=amount;
        System.out.println("Withdraw completed");
    }
    synchronized void deposit(int amount)
    {
        System.out.println("Starting deposit transaction");
        this.amount+=amount;
        System.out.println("Deposit completed");
        notify();
    }
}

public class InterThread
{
    public static void main(String[] args)
    {
        Customer c = new Customer();
        new Thread()
        {
            @Override
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread()
        {
            @Override
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
