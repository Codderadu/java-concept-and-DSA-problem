import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("adinath");
    sb.setCharAt(0, 's');
    System.out.println(sb);
    sb.insert(2,'n');
    System.out.println(sb);
    sb.delete(2,4);
    System.out.println(sb);
    }
    
}
