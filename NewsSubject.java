public interface NewsSubject {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void sendUpdate(String news);
}
