package models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interfaces.IABSObserver;

public class Subject {
    private Map<String, List<IABSObserver>> topicSubscribers = new HashMap<>();

    public void addObserver(User user) {
        for (String userTopic : user.getTopics()) {
                topicSubscribers.computeIfAbsent(userTopic, k -> new ArrayList<>()).add(user);
        }
    }

    public void removeObserver(User user) {
        for (String userTopic : user.getTopics()) {
            
                List<IABSObserver> observers = topicSubscribers.get(userTopic);
                if (observers != null) {
                    observers.remove(user);
                }
        }
    }

    public void notifyObservers(String topic, String news) {
        List<IABSObserver> observers = topicSubscribers.get(topic);
        if (observers != null) {
            for (IABSObserver observer : observers) {
                observer.update(news);
            }
        }
    }
}
