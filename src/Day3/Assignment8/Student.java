package Day3.Assignment8;

public class Student {

    int studentId;
    char studentType;
    String studentName;
    String residentialStatus;
    double feesPerMonth;

    public Student(){

    }

    public Student(int id, char type, String fname, String lname){
        studentId = id;
        studentType = type;
        studentName = fname + lname;
    }

    public void setStudentId(int id){
        studentId = id;
    }

    public void setStudentType(char type){
        studentType = type;
    }

    public void setStudentName(String fname, String lname){
        studentName = fname + lname;
    }

    public void setResidentialStatus(String status){
        residentialStatus = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void calculateFees(double semesterFees){
        feesPerMonth = semesterFees / 6.0;
    }

    public void calculateFees(double semesterFees, double hostelFees){
        feesPerMonth = semesterFees / 6.0;
        feesPerMonth = feesPerMonth + hostelFees;
    }

    public static void main(String[] args) {
        Student student = new Student(10, 'F', "Kush", "Panc");
        student.setResidentialStatus("Day scholar");
        if(student.residentialStatus.equalsIgnoreCase("day scholar")){
            student.calculateFees(48);
        }
        else
            student.calculateFees(48, 18);
        System.out.println(student.studentId + " " + student.getStudentType() + " " + student.getStudentName());
        System.out.println(student.getFeesPerMonth());
    }
}
