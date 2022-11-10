public class powerfn{
    public static int powerf(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int powernm1=powerf(x,n-1);
        int powerx=x*powernm1;
        return powerx;
    }
    public static void main(String[]args)
    {
          int x=2;
          int n=5;
          System.out.println(powerf(x,n));
    }
}
