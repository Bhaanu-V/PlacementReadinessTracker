import java.util.HashSet;
public class Dsatracker {
    
    HashSet<String> topics = new HashSet<>();

    void addTopic(String topic) {
        topics.add(topic);
    }

    void displayTopics() {

        System.out.println("Completed Topics:");

        for(String topic : topics) {
            System.out.println(topic);
        }
    }

    int getCount() {
        return topics.size();
    }
}

