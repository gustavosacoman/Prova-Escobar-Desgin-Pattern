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
        subject.addObserver(Alice);
        subject.addObserver(Bob);
        subject.addObserver(Charlie);

        subject.notifyObservers("Sports", "Latest sports news!");
        subject.notifyObservers("Technology", "New tech trends!");
        subject.notifyObservers("Politics", "Political updates!");

    }
}
