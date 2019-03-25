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

<<<<<<< HEAD
        System.out.println(students.get(0).getFullName());

=======
        System.out.print(students);
>>>>>>> 0b3c1e3435174b6ac54062da379cdfb281e4788d
    }
}
