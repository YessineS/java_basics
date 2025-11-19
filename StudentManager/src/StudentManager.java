import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
        rewriteFile("/home/yessine/Desktop/students.txt");
        System.out.println("Student removed from the list");
    }

    public void studentList(){
        loadFromFile("/home/yessine/Desktop/students.txt");
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
        loadFromFile("/home/yessine/Desktop/students.txt");
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

    public void saveToFile(String fileName, Student student) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(student.getName() + ',' +
                    student.getAge() + ',' +
                    student.getGender() + ',' +
                    student.getMajor() + ',' +
                    student.getNationality());
            pw.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void loadFromFile(String fileName) {
        students.clear();
        try {
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                Student newSt= new Student(data[0],Integer.parseInt(data[1]),data[2].charAt(0),data[3],data[4]);
                students.add(newSt);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void rewriteFile(String fileName) {
        try {
            PrintWriter rw = new PrintWriter(new FileWriter(fileName));

            for(Student student : students) {
                rw.println(student.getName() + ',' +
                        student.getAge() + ',' +
                        student.getGender() + ',' +
                        student.getMajor() + ',' +
                        student.getNationality());

            }
            rw.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
