class primenum 
{
 public static void main(String args[])
 {
    int p=0;
    int n=11;
    for(int i=1;i<=100;i++)
    {
        if (n%i==0)
        {
            p++;
        }
    }
    if(p==2)
    {
        System.out.println("The number is a prime number");
    }
    else
    System.out.println("The number is not a prime number");
 }
}