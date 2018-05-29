package TestFactory;

public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MainSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("error type");
            return null;
        }

    }
}
