import java.util.ArrayList;
import java.util.Collections;
public class arryList {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(5);
        System.out.println(list);
        int element=list.get(0);
        System.out.println(element);
        list.add(1,1);
        System.out.println(list);
        list.add(4);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
