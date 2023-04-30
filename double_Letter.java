import java.util.Scanner;

public class double_Letter {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the string - ");
    String s=obj.nextLine();
    char[] a = s.toCharArray();
    char[] b= new char[50];
    for(int i=0;i<a.length;i++)
    {
        for(int j=1;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                b[i]=a[i];
            }
            else
            {
                continue;
            }
        }
    }
    System.out.print(b);
}
}
