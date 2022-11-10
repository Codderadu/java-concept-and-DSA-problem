import java.util.*;
public class recursion {
    public static int printsum(int sum,int n) {
        if(n==0)
        {
            return sum;
        }
        sum+=n;
       return  printsum(sum,n-1);
        
    }
    public static void main(String[] args)
    {
        int n=6;
        int sum=0;
        System.out.println(printsum(sum,n));
    }
    
}
