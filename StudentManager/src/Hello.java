import java.util.Scanner;

public class Hello {

    public static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String number = sc.nextLine();

            try {
                return Integer.parseInt(number.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while(true){
            System.out.println("\n==== Student Manager ====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Remove Student");
            System.out.println("0. Exit");

            int option = readInt(sc, "Enter option: ");

            switch(option){
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    int age = readInt(sc, "Enter student age: ");

                    System.out.print("Enter student gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter student major: ");
                    String major = sc.nextLine();

                    System.out.print("Enter nationality: ");
                    String nationality = sc.nextLine();

                    Student st = new Student(age, name, gender, major, nationality);
                    sm.addStudent(st);
                    break;

                case 2:
                    sm.StudentList();
                    break;

                case 3:
                    int index = readInt(sc, "Enter student index: ");
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
