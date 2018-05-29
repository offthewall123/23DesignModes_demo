package TestAdapter;


/*
* 对象的适配器模式
* 不继承Source类
* 而是持有Source类的实例
* 达到解决兼容性问题
* */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source){
        super();
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
