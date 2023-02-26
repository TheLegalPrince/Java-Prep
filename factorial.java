public class factorial 
{
    public static void main(String[] args) 
    {
        int fact=1;
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial5 is "+fact);
    }
}   