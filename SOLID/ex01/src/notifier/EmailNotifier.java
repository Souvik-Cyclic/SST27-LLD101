package notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}
