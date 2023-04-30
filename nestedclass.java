import java.util.Scanner;

public class nestedclass {
    static class x
    {
        int c;
        void print()
        {
            System.out.println("hi i am in class");
        }
        static public class y
        {
            String name;
            void getin()
            {
                System.out.println(name);
            }
            void getdata()
            {
                Scanner s1=new Scanner(System.in);
                name=s1.nextLine();
                s1.close();
            }
        }
        public static void main(String[] args)
        {
            x x1=new x();
            y y1=new y(); 
        }
    }
}
