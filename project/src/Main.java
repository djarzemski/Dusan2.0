import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            students = Data.load("project/src/database.csv");
        }catch (FileNotFoundException e){
            System.out.println(e + "There is a problem with loading the data. Check if the csv file is in correct folder.");
        }

        System.out.println(students.get(0).getFullName());

    }
}
