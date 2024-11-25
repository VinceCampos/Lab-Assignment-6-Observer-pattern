import java.util.*;

public class NewsService {

    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();
        agency.setSubscribers(new ArrayList<>());

        Subscriber user1 = new Subscriber();
        user1.setSubscriberName("Kenshin");

        Subscriber user2 = new Subscriber();
        user2.setSubscriberName("Aren");

        Subscriber user3 = new Subscriber();
        user3.setSubscriberName("Joaquin");

        agency.addSubscriber(user1);
        agency.addSubscriber(user2);

        System.out.println("\nBreaking News...");
        agency.setTitle("2024 Philippine Elections Start!");
        agency.sendUpdate("\nMake sure you're registered to vote!\n");

        agency.removeSubscriber(user2);
        agency.addSubscriber(user3);

        System.out.println("\nLatest Update...");
        agency.setTitle("Monthly Market Price Trends");
        agency.sendUpdate("\nPlan your shopping wisely this month.\n");
    }
}