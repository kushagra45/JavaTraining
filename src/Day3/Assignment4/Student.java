package Day3.Assignment4;

public class Student {

    int studentId;
    char studentType;
    String studentName;

    public Student(){
        studentId = 10;
        studentType = 'F';
    }

    public Student(int id, char type, String fname, String lname){
        studentId = id;
        studentType = type;
        studentName = fname + lname;
    }

    public void setStudentId(int id){
        studentId = id;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String fname, String lname){
        studentName = fname + lname;
    }

    public int getStudentId(){
        return studentId;
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentId(10);
        student.setStudentType('F');
        student.setStudentName("Kush", "Panc");
        System.out.println(student.getStudentId());
        System.out.println(student.studentType + " " + student.studentName);
    }

}
