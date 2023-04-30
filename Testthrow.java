public class Testthrow {
    public static void main(String[] args) {
        int i1=15;
        int i2=20;
        if(i1>i2)
        {
            throw new Exception("First number can not be more");
        }
        else{
            System.out.println("OK");
        }
    }
}
