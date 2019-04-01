import java.util.ArrayList;

public class StudentGroup {
    private ArrayList<Student> picked_students;

    public StudentGroup(){
        picked_students = new ArrayList();
    }

    /**
     * add students' array to the local variable
     * @param student
     */
    public void addStudent(Student student){
        this.picked_students.add(student);
    }

    /**
     * Group the data by year
     * @param year
     * @param students
     * @return
     */
    public ArrayList<Student> groupbyYear(int year, ArrayList<Student> students){
        for(Student x: students){
            if(x.getYear()==year) addStudent(x);
        }

        return picked_students;
    }

    /**
     * Group the data by gender
     * @param gender
     * @param students
     * @return
     */
    public ArrayList<Student> groupbyGender(Gender gender, ArrayList<Student> students){
        for(Student x: students){
            if(x.getGender()==gender) addStudent(x);
        }

        return picked_students;
    }

    /**
     * Group the data by hall
     * @param hall
     * @param students
     * @return
     */
    public ArrayList<Student> groupbyHall(String hall, ArrayList<Student> students){
        for(Student x: students){
            if(x.getHall().equals(hall)) addStudent(x);
        }

        return picked_students;
    }
}