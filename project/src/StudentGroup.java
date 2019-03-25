import java.util.ArrayList;

public class StudentGroup {
    private ArrayList<Student> picked_students;

    public StudentGroup(){
        picked_students = new ArrayList();
    }

    public void addStudent(Student student){
        this.picked_students.add(student);
    }

    public ArrayList<Student> groupbyYear(int year, ArrayList<Student> students){
        for(Student x: students){
            if(x.getYear()==year) addStudent(x);
        }

        return picked_students;
    }

    public ArrayList<Student> groupbyGender(Gender gender, ArrayList<Student> students){
        for(Student x: students){
            if(x.getGender()==gender) addStudent(x);
        }

        return picked_students;
    }

    public ArrayList<Student> groupbyHall(String hall, ArrayList<Student> students){
        for(Student x: students){
            if(x.getHall()==hall) addStudent(x);
        }

        return picked_students;
    }

}
