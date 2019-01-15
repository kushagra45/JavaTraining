package Day3.Assignment1;

public class Student {

    static int studentCount = 10;
    int studentId;
    String studentName;
    String studentType;

    public Student(String studentType, String fname, String lname){
        studentCount++;
        this.studentId = studentCount;
        this.studentType = studentType;
        studentName = fname + lname;
    }

    public void displayDetails(Student obj){
        System.out.println(obj.getStudentId() + " " + obj.getStudentName() + " " + obj.getStudentType());
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentType() {
        return studentType;
    }

    public static void main(String[] args) {
        Student s1 = new Student("D", "Bony", "Thomas");
        s1.displayDetails(s1);
        Student s2 = new Student("H", "Dinil", "Bose");
        s2.displayDetails(s2);
        System.out.println(Student.getStudentCount());
    }
}
