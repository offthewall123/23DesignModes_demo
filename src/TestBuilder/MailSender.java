package TestBuilder;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mailsend");
    }
}
