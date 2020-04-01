package JiHeKuangJia;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("a");
        list.add(1);
        list.add("a");
        list.add(true);
        System.out.println(list);//[a, 1, a, true]
        //    System.out.println(list.get(3));
        System.out.println( list.indexOf("a"));//0
        System.out.println( list.lastIndexOf("a"));//2
    }
}
