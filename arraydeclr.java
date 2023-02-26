public class arraydeclr 
{
    public static void main(String[] args)
    {
        int sum=0,a[]={1,2,3,4,5},temp;
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        for(int i=0;i<5;i++)
        {
            for(int j=4;j>=0;j--)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
