import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    public static ArrayList<Student> load(String path) throws FileNotFoundException{
        ArrayList<Student> students = new ArrayList<>();
        System.out.println(path);
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter(",|\r\n");


        String mail = "";
        String hall = "";
        String name = "";
        String year = "";

        int x = 0;
        while (scanner.hasNext()){
            switch (x++){
                case 0:
                    mail = scanner.next();
                    break;

                case 1:
                    hall = scanner.next();
                    break;
                case 2:
                    name = scanner.next();
                    break;
                case 3:
                    year = scanner.next();

                    students.add(new Student(mail, name, hall, year));

                    mail = "";
                    hall = "";
                    name = "";
                    year = "";
                    x = 0;
                    break;
            }
        }

        scanner.close();
        return students;
    }
}
