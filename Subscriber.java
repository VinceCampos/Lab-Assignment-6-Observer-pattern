public class Subscriber implements SubscriberObserver {

    private String name;

    public String getSubscriberName() {
        return name;
    }

    public void setSubscriberName(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String news) {
        System.out.println("Dear " + name + ", here’s the news for you: " + news);
    }
}
