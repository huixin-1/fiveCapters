package second;

import java.util.ArrayList;
import java.util.List;

/**
 * 当作一些集合统一操作的时候，需要保证集合的类型是统一的，此时需要泛型来进行限制
 *    优点：
 *        1、数据安全
 *        2、获取数据时效率比较高
 *     给集合中的元素设置相同的类型就是泛型的基本需求
 *
 *     使用：
 *       在定义对象的时候，通过<>中设置合理的类型来进行是实现
 *
 *    泛型的高阶应用：
 *       1、泛型类
 *          在定义类名的时候，通过<E,K,V,A,B>，起到占位作用，类中的方法和返回值类型都可以使用
 *       2、泛型接口
 *           在定义接口的时候，在接口的名称后添加<E,K,V,A,B>
 *           1、子类在进行实现的时候，可以不填写泛型的类型，此时在创建具体的子类对象的时候才决定使用什么类型
 *           2、子类在实现泛型接口的时候，只在实现父类接口的时候值指定父类泛型类型即可，此时，测试方法中的泛型类型，必须和子类保持一致
 *       3、泛型方法
 *           在定义泛型方法的时候，指定方法的返回值和参数是泛型
 *       4、泛型上限
 *       5、泛型下限
 *
 *
 */



 public class FanXingDemo {
    public static void main(String[] args) {
     /*   List list=new ArrayList();
        list.add(1);
        list.add("abc");
        list.add(true);
        list.add(new Person("zhangsan",12));
        System.out.println(list);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (Object iter:list){
            System.out.println(iter);

        }

    */



    /*
    FanXingClass<String> fxc=new FanXingClass<String>();
    fxc.setA("mashibing");
    fxc.setId(1);
    fxc.show();//id:1a:mashibing

    FanXingClass<Integer> fxc2=new FanXingClass<Integer>();
    fxc2.setA(34);
    fxc2.setId(1);
    fxc2.show();//id:1a:34


    FanXingClass<Person> fxc3=new FanXingClass<Person>();
    fxc3.setA(new Person("aaa",123));
    fxc3.setId(3);
    fxc3.show();//id:3a:Person{name=aaa',age=123}
    System.out.println(fxc3.get());//Person{name=aaa',age=123}
    fxc3.set(new Person("hehe",123));//执行set方法：Person{name=hehe',age=123}
    */




    }



}
