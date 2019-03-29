import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            students = Data.load("database.csv");
        }catch (FileNotFoundException e){
            System.out.println(e + "There is a problem with loading the data. Check if the csv file is in correct folder.");
        }

        String message1 = "Based on what should the groups be formed? \n 11 - year one \n 12 - year two \n 13 - year three \n 14 - year four \n 21 - male students \n 22 - female students \n 31 - founders \n 32 - gentlemen \n 33 - sprouts \n 34 - fortes";

        int input1 = Integer.valueOf(JOptionPane.showInputDialog(null, message1));
        int input2 = Integer.valueOf(JOptionPane.showInputDialog(null, "How many people should be in the group?"));
    
        StudentGroup ourStudents = new StudentGroup();
        ArrayList<Student> pickedStudents = new ArrayList<>();
        switch(input1){
            case 11:
                pickedStudents = ourStudents.groupbyYear(1, students);
                break;
            case 12:
                pickedStudents = ourStudents.groupbyYear(2, students);
                break;
            case 13:
                pickedStudents = ourStudents.groupbyYear(3, students);
                break;
            case 14:
                pickedStudents = ourStudents.groupbyYear(4, students);
                break;
            case 21:
                pickedStudents = ourStudents.groupbyGender(Gender.MALE, students);
                break;
            case 22:
                pickedStudents = ourStudents.groupbyGender(Gender.FEMALE, students);
                break;
            case 31:
                pickedStudents = ourStudents.groupbyHall("Founders", students);
                break;
            case 32:
                pickedStudents = ourStudents.groupbyHall("Gentlemen", students);
                break;
            case 33:
                pickedStudents = ourStudents.groupbyHall("Sprouts", students);
                break;
            case 34:
                pickedStudents = ourStudents.groupbyHall("Fortes", students);
                break;
            default:

            break;
        }

        Groups test = new Groups(pickedStudents,input2);
        System.out.println(test);

    }
}
