import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        while(true){
            System.out.println("\n==== Student Manager ====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Remove Student");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.next();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter student gender: ");
                    String gender = sc.next();
                    System.out.print("Enter student Major: ");
                    String major = sc.next();
                    System.out.print("Enter Nationality: ");
                    String nationality = sc.next();
                    Student st = new Student(age,name,gender,major,nationality);
                    sm.addStudent(st);
                    break;
                case 2:
                    sm.StudentList();
                    break;
                case 3:
                    System.out.println("Index: ");
                    int index= sc.nextInt();
                    sm.removeStudent(index);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Wrong option!");
            }
        }
    }
}
