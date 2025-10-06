
import java.util.ArrayList;
import java.util.List;

public class User extends ABSObserver {
    private String name;
    private List<String> topics = new ArrayList<String>();

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
