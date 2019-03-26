import java.util.*;
public class Groups {
    private ArrayList<ArrayList<Student>> groupsOfStudents = new ArrayList<ArrayList<Student>>();

    public Groups(ArrayList<Student> students, int num){
        shuffleList(students);
    }
    private static void shuffleList(ArrayList<Student> students){
        Collections.shuffle(students);
    
    }
    private static ArrayList<ArrayList<Student>> makeSubGroups(ArrayList<Student> students, int num){
        for (Student student : students) {
            
            
        }
    }
}
