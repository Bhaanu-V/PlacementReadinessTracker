public class Student {

    String name;
    String branch;
    int year;

    Student(String name, String branch, int year) {
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Year : " + year);
    }
}