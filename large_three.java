public class large_three {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=30;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("The largest number is "+a);
            }
            else
            {
                System.out.println("The largest number is "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("The largest number is "+b);
            }
            else
            {
                System.out.println("The largest number is "+c);
            }
        }
    }
}
