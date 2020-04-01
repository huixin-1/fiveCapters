package second;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 在java代码中包含三种循环方式
 *   do...while
 *   while
 *   for
 *   还有一种增强的for循环方式，可以简化循环的编写
 *
 *   所有的集合类都默认实现了Iterable的接口，实现此接口意味着具备了增强for
 *     增强for循环本质也是使用iterator的功能
 *       方法：
 *         iterator（）
 *         foreach（）
 *     在iterator的方法中，要求返回一个Iterator的接口实例对象
 *     此接口包含了
 *         hasNext（）
 *         next（）
 *
 *
 */

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //迭代器
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
