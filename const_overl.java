public class const_overl {
    int g=1000;
    public class Account{
        Account()
        {
            System.out.println("Account holder - Prince Srivastava");
            System.out.println("Account number - 12345678");
            System.out.println("Initial Account - 1000");
        }
        Account(int a)
        {
            System.out.println("Account holder - Prince Srivastava");
            System.out.println("Account number - 12345678");
            System.out.println("Address - Mathura, Uttar Pradesh");
            System.out.println("Account Type - Savings");
            System.out.println("Current Balance - "+g);
        }
        int deposit(int d)
        {
            return g=g+d;
        }
        int withdraw(int w)
        {
            return g=g-w;
        }
        int get_balanace()
        {
            return g;
        }
        public static void main(String[] args) {
            Account obj=new Account(5);
            System.out.println("After depositing 1000 the balance now is - "+obj.deposit(1000));
            System.out.println("After withdrawing 1000 the balance now is - "+obj.withdraw(1000));
            System.out.println("The current balance now is - "+obj.get_balanace());
            //System.out.println("The initial details are - "+obj1.Account(5));
        }
    }
}