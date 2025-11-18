import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added to the list");
    }

    public void removeStudent(int index) {
        if(index <0 || index >= students.size()) {
            System.out.println("Student index out of bounds");
            return;
        }
        students.remove(index);
        System.out.println("Student removed from the list");
    }

    public void StudentList(){
        if(students.isEmpty()) {
            System.out.println("There are no students in the list");
            return;
        }
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
