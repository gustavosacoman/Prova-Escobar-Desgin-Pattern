import models.Subject;
import models.User;

public class Main {
    public static void main(String[] args) {
        
        User Alice = new User("Alice");
        User Bob = new User("Bob");
        User Charlie = new User("Charlie");

        Alice.addTopic("Sports");
        Alice.addTopic("Technology");
        Bob.addTopic("Politics");
        Charlie.addTopic("Technology");
        Charlie.addTopic("Sports");

        Subject subject = new Subject();
        for (String topic : Alice.getTopics()) {
            subject.addObserver(topic, Alice);
        }
        for (String topic : Bob.getTopics()) {
            subject.addObserver(topic, Bob);
        }
        for (String topic : Charlie.getTopics()) {
            subject.addObserver(topic, Charlie);
        }

        subject.notifyObservers("Sports", "Latest sports news!");
        subject.notifyObservers("Technology", "New tech trends!");
        subject.notifyObservers("Politics", "Political updates!");

    }
}
