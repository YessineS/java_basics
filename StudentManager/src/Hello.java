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
    public static char  readChar(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String character = sc.nextLine().trim();
            if (character.isEmpty() || ( Character.toUpperCase(character.charAt(0)) != 'M' && Character.toUpperCase(character.charAt(0)) !='F' ) ) {
                System.out.println("Please enter a valid character.");
            }else{
                return character.charAt(0);
            }
        }
    }

    public static String readString(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String string = sc.nextLine().trim();

            if(string.isEmpty() || !string.matches("[a-zA-Z ]+")) {
                System.out.println("Please enter a valid string.");
            }else{
                return string;
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
            System.out.println("4. Search Student by name");
            System.out.println("0. Exit");

            int option = readInt(sc, "Enter option: ");

            switch(option){
                case 1:
                    String name = readString(sc, "Enter student name: ");
                    int age = readInt(sc, "Enter student age: ");
                    char gender = readChar(sc,"Enter student gender(M or F): ");
                    String major = readString(sc, "Enter student major: ");
                    String nationality = readString(sc, "Enter nationality: ");

                    Student st = new Student(name, age, gender, major, nationality);
                    sm.addStudent(st);
                    sm.saveToFile("/home/yessine/Desktop/students.txt",st);
                    break;

                case 2:
                    sm.studentList();
                    break;

                case 3:
                    sm.studentList();
                    int index = readInt(sc, "Enter student index: ");
                    sm.removeStudent(index);
                    break;
                case 4:
                    String studentName= readString(sc, "Enter student name: ");
                    sm.getStudent(studentName);
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
