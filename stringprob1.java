import java.util.Scanner;

public class stringprob1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string - ");
        String s1=obj.nextLine();
        //String is www.w3schools.com/javatutprial/string
        s1=s1.replace(".","");
        s1=s1.replace("/","");
        System.out.println(s1);
        
        /*for(int i=0;i<=s1.length();i++)
        {
        if(s1.charAt(i)>64 && s1.charAt(i)<122)
        {
            s1=s1+1(i);
        }
        System.out.println("The final string after removing the special characters is",s1); 
        }*/
    }
}
