public class reversenum 
{
    public static void main(String[] args)
    {
        int n=987654, r=0;
        while(n!=0)   
        {  
            int remainder = n%10;  
            r=r*10 +remainder;  
            n=n/10;  
        }  
    System.out.println("The reverse of the given number is: " + r); 
    }
}
