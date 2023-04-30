import java.util.InputMismatchException;

public class excep_divide
{
    public static void main(String[] args) {
        int a,b,c;
        try
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=a/b;
            System.out.println("c="+c);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Input Mismatch");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Arguments");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Second value can not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Pass proper arguments");
        }
        /*catch(Exception e)
        {
            System.out.println("It is"+ e);
        }*/
    }
}