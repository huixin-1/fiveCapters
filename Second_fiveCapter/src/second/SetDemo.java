package second;
/*
  没学好  重看一下

   1、set中存放的是无序的，唯一的数据
   2、set不可以通过下标获得对应位置的元素值；，因为无序的特点
   3、使用treeset底层的实现是treemap，利用红黑树来进行实现
   4、设置元素的时候，如果是自定义自定义对象，会查找对象中的equals和hashcode的方法，如果没有放置的是地址
   5、树中的元素是要默认进行排序操作的，如果是基本数据类型，自动比较，如果是引用数据类型，需要自定义比较器

    比较器分类：
        内部比较器
             定义在元素的类中，通过实现comparable接口进行实现
        外部比较器
             定义在当前类中，通过实现comparator接口来进行实现，但是要将该比较器传递到集合中
          注意：   外部比较器可以定义成一个工具类，此时所有需要比较的规则一致的话，可以复用
                  内部比较器 只有储存当前对象的时候在可以使用
                  如果两者同时存在使用外部比较器
                  当使用比较器的时候不会使用equals方法

 */

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SetDemo implements Comparator<Person> {
    public static void main(String[] args) {
       /* Set set=new HashSet();
        set.add("123");
        set.add(1);
        set.add(true);
        set.add("123");
        System.out.println(set);//[1, 123, true]
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------");

        //将while循环改成for循环，推荐使用

        for (Iterator iter=set.iterator();iter.hasNext();){
            System.out.println(iter.next());

        }*/

        TreeSet treeSet =new TreeSet();
        treeSet.add(new Person("zhangsan",15));
        treeSet.add(new Person("wangwu",13));
        treeSet.add(new Person("lisi",19));
        treeSet.add(new Person("maliu",11));

        System.out.println(treeSet);//上面顺序再换  ，打印顺序不换
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    @Override
    public Comparator<Person> reversed() {
        return null;
    }

    @Override
    public Comparator<Person> thenComparing(Comparator<? super Person> other) {
        return null;
    }

    @Override
    public <U> Comparator<Person> thenComparing(Function<? super Person, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Person> thenComparing(Function<? super Person, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Person> thenComparingInt(ToIntFunction<? super Person> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Person> thenComparingLong(ToLongFunction<? super Person> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Person> thenComparingDouble(ToDoubleFunction<? super Person> keyExtractor) {
        return null;
    }
}
