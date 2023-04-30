public class private_overr{
    public static class x{
        private int sum(int a,int b){
            return a+b;
        }
    }
    static class y extends x{
        private int sum(int a,int b,int c)
        {
            return a+b+c;
        }
    }
        public static void main(String[] args){
            x obj=new y();
            //System.out.println(obj.sum(10,20,30));
            System.out.println(obj.sum(10,20));
    }
}