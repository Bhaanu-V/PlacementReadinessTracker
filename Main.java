import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Placement Readiness Tracker =====");

            System.out.println("1.Student");
            System.out.println("2.DSA Tracker");
            System.out.println("3.Problem Counter");
            System.out.println("4.Aptitude");
            System.out.println("5.Resume");
            System.out.println("6.Company");
            System.out.println("7.Report");
            System.out.println("8.Save");
            System.out.println("9.Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

        } while(choice != 9);

        sc.close();
    }
}

