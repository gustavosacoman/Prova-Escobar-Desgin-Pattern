package models;
import interfaces.IABSObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {

    // Uso do map para associar tópicos a listas de observadores
    private Map<String, List<IABSObserver>> topicSubscribers = new HashMap<>();

    public void addObserver(String topic, IABSObserver observer) {
        topicSubscribers.computeIfAbsent(topic, k -> new ArrayList<>()).add(observer);
    }
    
    public void removeObserver(String topic, IABSObserver observer) {
        List<IABSObserver> observers = topicSubscribers.get(topic);
        if (observers != null) {
            observers.remove(observer);
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
