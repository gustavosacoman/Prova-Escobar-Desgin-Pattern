package models;

import interfaces.IABSObserver;
import java.util.ArrayList;
import java.util.List;

// Implementação da interface IABSObserver
// User que vai receber as notificações e envia-las para o console
public class User implements IABSObserver {
    private String name;
    private List<String> topics = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addTopic(String topic) {
        topics.add(topic);
    }

    public List<String> getTopics() {
        return topics;
    }

    public void removeTopic(String topic) {
        topics.remove(topic);
    }
    
    @Override
    public void update(String news) {
        System.out.println(name + " received update: " + news);
    }
    
}
