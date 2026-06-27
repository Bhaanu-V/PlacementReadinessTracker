import java.io.FileWriter;

public class Filemanager {

    void save(String data) {

        try {

            FileWriter fw = new FileWriter("progress.txt");

            fw.write(data);

            fw.close();

            System.out.println("Saved Successfully");

        } catch(Exception e) {

            System.out.println("Error");
        }
    }
}

