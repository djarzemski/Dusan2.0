import java.util.*;
public class Groups {
    private ArrayList<ArrayList<Student>> groupsOfStudents = new ArrayList<ArrayList<Student>>();

    public Groups(ArrayList<Student> students, int num){
        shuffleList(students);
        makeSubGroups(students, num);
    }
    private static void shuffleList(ArrayList<Student> students){
        Collections.shuffle(students);
    
    }
    private void makeSubGroups(ArrayList<Student> students, int num){
        for(int i = 0;i<students.size();i++) {
            if(i%num==0){
                groupsOfStudents.add(new ArrayList<Student>());
            }
            groupsOfStudents.get(i/num).add(students.get(i));     
        }
    }
    public ArrayList<ArrayList<Student>> getGroups(){
        return groupsOfStudents;
    }
    @Override
    public String toString(){
        String output = "";
        int b = 1;
        for(int a=0; a<groupsOfStudents.size(); a++){
            output += "\n"+"Group number"+b+"\n\n";
            for(int o = 0; o<groupsOfStudents.get(a).size();o++){
                output += groupsOfStudents.get(a).get(o).getFullName() + "\n";
        
            } 
            b += 1;   
        }
        return output;

    }

}
