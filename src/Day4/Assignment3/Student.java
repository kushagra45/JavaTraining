package Day4.Assignment3;

public class Student {

     private int studentId;
     private char studentType;
     private String studentName;
     private double feesPerMonth;

    public Student(){
    }


    public Student(int id, char type, String fname, String lname){
        studentId = id;
        studentType = type;
        studentName = fname + lname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    public void displayStudentDetails(){
        System.out.println(studentId + studentName + studentType + feesPerMonth);
    }
}
