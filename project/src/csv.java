import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class csv {

    public static void main(String[] args){
        public csv(String csv_path) throws FileNotFoundException{
            Scanner scanner = new Scanner(new File(csv_path));
            scanner.useDelimiter(",|\r\n");

            int x = 0;
            while (scanner.hasNext()){
                switch (x++){
                    case 0:

                        break;

                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        x = 0;
                        break;
                }
            }

            scanner.close();
        }
    }
}
