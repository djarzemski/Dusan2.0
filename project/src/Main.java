import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            students = Data.load("database.csv");
        }catch (FileNotFoundException e){
            System.out.println(e + "There is a problem with loading the data. Check if the csv file is in correct folder.");
        }
    }
}
