public class Resumetracker {
    boolean resume;
    boolean linkedin;
    boolean portfolio;
    boolean github;

    void update() {

        resume = true;
        linkedin = true;
    }

    void display() {

        System.out.println("Resume : " + resume);
        System.out.println("LinkedIn : " + linkedin);
        System.out.println("Portfolio : " + portfolio);
        System.out.println("GitHub : " + github);
    }
}

