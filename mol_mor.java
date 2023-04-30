public class mol_mor 
{
    class mol
    {
        int olfun(int a, int b)
        {
            int c=a+b;
            return c;
            super.mol();
        }
        int olfun(int a, int b, int c)
        {
            int d=a+b+c;
            return d;
        }
    }
    class mor extends mol
    {
        int olfun(int a, int b)
        {
            int c=a-b;
            return c;
        }
    }
class main{
    public static void main(String[] args) 
    {
        int s;
        mor obj=new mol();
        s=obj.olfun(15,10);
    }
}
}