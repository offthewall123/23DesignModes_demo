package TestAdapter;

public class AdaptTest2 {
    public static void main(String[] args) {
        Source source=new Source();
        Targetable target=new Wrapper(source);
        target.method1();
        target.method2();
    }
}
