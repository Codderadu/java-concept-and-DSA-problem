import java.util.*;
public class stcck {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
