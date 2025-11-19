public class Student {
    private int age;
    private String name;
    private char gender;
    private String major;
    private String nationality;
    public Student(String name, int age, char gender, String major, String nationality) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.major = major;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String getMajor() {
        return major;
    }
    public String getNationality() {
        return nationality;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return  "Student{" + "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", nationality='" + nationality + '\'' +
                "}";

    }
}
