import java.util.Scanner;

public class extend_class {
    public class X
    {
        int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
}
public class y extends X
{
    int sub(int a, int b)
    {
        int c=a-b;
        return c;
    }
}
public class z extends y
{
    int mul(int a,int b)
    {
        int c=a*b;
        return c;
    }
}
public class A extends z
{
    int div(int a, int b)
    {
        int c=a/b;
        return c;
    }
}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        A a1=new A();
        a1.add(a,b);
        a1.sub(a,b);
        a1.mul(a,b);
        a1.div(a,b);
    }
}