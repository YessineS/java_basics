public class Student {
    int age;
    String name;
    char gender;
    String major;
    String nationality;
    public Student(int age, String name, char gender, String major, String nationality) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.major = major;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';

    }
}
