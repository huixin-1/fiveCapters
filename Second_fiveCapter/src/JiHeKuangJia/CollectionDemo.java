package JiHeKuangJia;

/*
java集合框架：
Collection：存放的是单一值
   特点：
     1、可以存放不同类型的数据，而数组只能存放固定类型的数据
     2、当使用arraylist子类实现的时候，初始化的长度是10，当长度不够的时候会自动进行扩容操作

    api方法：
      增加数组的方法
       add：要求必须传入的参数是Object对象，因此当写入基本数据类型类型的时候，包含了自动拆箱和自动装箱过程
       addAll:添加另一个元素的集合到此元素中

      删除数组的方法：
       clear:只是清空集合中的元素，但是此集合中的对象并没有被回收
       remove:删除指定元素
       removeAll:删除集合元素
       contains:判断集合中是否包含指定元素
       containsAll:判断此集合中是否包含另一集合
       isEmpty:判断集合是否等于空
       retainAll:若集合中拥有另一个集合的所有元素，返回true，否则返回false
       size：返回当前集合的大小
       toArray:将集合转换成数组

 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(new Integer(1));
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        System.out.println(collection);//[1, true, 1.23, abc]


        //强制类型转换
        ((ArrayList)collection).add(0,"mashibing");//
        System.out.println(collection);//[mashibing, 1, true, 1.23, abc]

        Collection collection1= new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        collection.addAll(collection1);//

        System.out.println(collection);//[mashibing, 1, true, 1.23, abc, a, b, c, d]
        //   collection.clear();
        //   System.out.println(collection);//[]
        System.out.println(collection.contains("a"));//true
        System.out.println(collection.containsAll(collection1));//true
        System.out.println(collection.isEmpty());//false
        collection.remove("a");
        System.out.println(collection);//[mashibing, 1, true, 1.23, abc, b, c, d]
        System.out.println(collection1.retainAll(collection));//true
        Object[] objects = collection.toArray();
        ((ArrayList) collection).add("a");//[mashibing, 1, true, 1.23, abc, b, c, d, a]
        System.out.println(collection);

    }
}
