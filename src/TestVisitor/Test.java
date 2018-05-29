package TestVisitor;

//访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦，
public class Test {
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
