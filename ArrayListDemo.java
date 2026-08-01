import java.util.*;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,10);
        list.add(1,20);
        list.add(2,30);
        System.out.println(list);
        list.set(1,70);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
    
}
