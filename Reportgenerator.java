public class Reportgenerator {

    void generate(int completedTopics) {

        int readiness = completedTopics * 10;

        if(readiness > 100)
            readiness = 100;

        System.out.println("Readiness : " + readiness + "%");
    }
}

