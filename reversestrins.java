import java.util.*;
public class reversestrins {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        StringBuilder sb=new StringBuilder(name);
        int front=0;
        int end=name.length()-1;
        while(front<end)
        {
             char f=sb.charAt(front);
             char e=sb.charAt(end);
             sb.setCharAt(front, e);
             sb.setCharAt(end, f);
             front++;
             end--;

        }
        System.out.println(sb);
    }
}
 