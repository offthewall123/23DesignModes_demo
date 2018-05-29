package TestCommand;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);

        //Invoker 调Command  Command调 Receiver
        invoker.action();
    }
}
