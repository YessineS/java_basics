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
        for(int i=0; i<students.size(); i++) {
            System.out.println(i + ": " + students.get(i));
        }
    }

    public void getStudent(String name) {
        boolean found = false;
        for(int i=0; i<students.size(); i++) {
            if(students.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(i + ": " +  students.get(i));
                found = true;
            }
        }
        if(!found) {
            System.out.println("Student not found");
        }
    }
}
