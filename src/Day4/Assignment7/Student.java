package Day4.Assignment7;

public class Student {

    private int studentId;
    private char studentType;
    private String studentName;
    final private int semFees = 12000;
    private int feesPerMonth;

    public Student() {
    }

    public Student(int studentId, char studentType, String studentName, int feesPerMonth) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
        this.feesPerMonth = feesPerMonth;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void calculateFees(){
        feesPerMonth = semFees / 6;
    }

    public void displayDetails(){
        System.out.println(studentId + " " + studentType + " " + studentName + " " + semFees);
    }
}
