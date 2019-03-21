import java.util.ArrayList;

public class StudentGroup {
    private ArrayList<Student> students;

    public StudentGroup(){
        students = new ArrayList();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

}
