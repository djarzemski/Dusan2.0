import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class csv {

    public static void main(String[] args){
        public csv(String csv_path) throws FileNotFoundException{
            public ArrayList<Student> students = new ArrayList<>();
            
            Scanner scanner = new Scanner(new File(csv_path));
            scanner.useDelimiter(",|\r\n"); // ,|\\n
            
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
                        
                        students.add(new Student(mail, hall, name, year);
                                     
                        mail = "";
                        hall = "";
                        name = "";
                        year = "";             
                        x = 0;
                        break;
                }
            }

            scanner.close();
        }
    }
}
