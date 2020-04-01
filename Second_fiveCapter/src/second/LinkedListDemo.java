package second;

import java.util.LinkedList;

/**
 * listedList拥有更加丰富的方法，需要用的时候查找api即可，不需要记忆
 *
 *
 */

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");
        System.out.println(linkedList);//[123, false, abc]
        linkedList.add(0,"mashibing");
        System.out.println(linkedList);//[mashibing, 123, false, abc]
        linkedList.addFirst("111");
        linkedList.addLast("22222");
        System.out.println(linkedList);//[111, mashibing, 123, false, abc, 22222]
        System.out.println(linkedList.element());//111
        linkedList.offer("333");
        System.out.println(linkedList);


    }


}

