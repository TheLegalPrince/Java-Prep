public class testthrows {
    public static void main(String[] args) {
        int i; int n=args.length;
        try{
            for(i=0;i<n;i++)
            dispnames(args[i]);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not found\n"+e);
        }
    }
    static void dispnames(String s) throws ClassNotFoundException
    {
        Class c=Class.forName(s);
        System.out.println("class name"+c.getName());
    }
}