import java.util.ArrayList;
public class Companytracker {

    ArrayList<String> companies = new ArrayList<>();

    void addCompany(String company) {

        companies.add(company);
    }

    void display() {

        for(String company : companies) {

            System.out.println(company);
        }
    }
}

