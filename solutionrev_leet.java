import java.lang.Integer;
class solutionrev_leet{
public int reverse (int x)
    {
        long rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)rev;
    }
    public static void main(String args[])
    {
        solutionrev_leet obj=new solutionrev_leet(); 
        int p=0;
        p=obj.reverse(15555544);
        System.out.println(p);
    }
}
