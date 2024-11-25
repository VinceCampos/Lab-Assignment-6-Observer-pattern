import java.util.*;

public class NewsAgency implements NewsSubject {

    private String title;
    private String content;
    private List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    // Getters and Setters for title and content
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void sendUpdate(String news) {
        this.content = news; // Set the latest news content
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNotification(title + ": " + content);
        }
    }
}
