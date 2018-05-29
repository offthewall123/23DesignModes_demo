package TestAdapter;


/*
* extends source 获得 method1()
* implement Targetable 重写获得method()2;
* */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
