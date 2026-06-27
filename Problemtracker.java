public class Problemtracker {
    int solved = 0;
    int goal = 150;

    void updateSolved(int count) {
        solved = count;
    }

    void progress() {

        double percent = (solved * 100.0) / goal;

        System.out.println("Solved : " + solved);
        System.out.println("Goal : " + goal);
        System.out.println("Progress : " + percent + "%");
    }
}

