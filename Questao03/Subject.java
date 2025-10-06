import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    private Map<String, List<ABSObserver>> topicSubscribers = new HashMap<>();

    public void addObserver(User user) {
        for (String userTopic : user.getTopics()) {
                topicSubscribers.computeIfAbsent(userTopic, k -> new ArrayList<>()).add(user);
        }
    }

    public void removeObserver(String topic, ABSObserver observer, User user) {
        for (String userTopic : user.getTopics()) {
            if (userTopic.equals(topic)) {
                List<ABSObserver> observers = topicSubscribers.get(userTopic);
                if (observers != null) {
                    observers.remove(observer);
                }
            }
        }
    }
    
    public void notifyObservers(String topic, String news) {
        List<ABSObserver> observers = topicSubscribers.get(topic);
        if (observers != null) {
            for (ABSObserver observer : observers) {
                observer.update(news);
            }
        }
    }
}
