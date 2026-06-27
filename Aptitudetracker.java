 import java.util.HashMap;
public class Aptitudetracker {
    HashMap<String,Integer> score = new HashMap<>();

    void addScore(String subject,int marks) {

        score.put(subject,marks);
    }

    void display() {

        for(String key : score.keySet()) {

            System.out.println(key + " : " + score.get(key));
        }
    }
}

