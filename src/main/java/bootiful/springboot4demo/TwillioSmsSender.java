package bootiful.springboot4demo;

public class TwillioSmsSender implements SmsSender {

    @Override
    public void send(String to) {
        System.out.println("Twillio SMS Sent to " + to);
    }
}
