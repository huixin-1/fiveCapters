package second;

public class FanXingInterfaceSub<B> implements FanXingInterface<B> {


    @Override
    public B test() {
        return null;
    }

    @Override
    public void test2(B b) {

    }

    public void test2(String o){
        System.out.println(o);
    }

}
