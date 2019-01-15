package Day2.Assignment4;

public class Student {

    int studentID;
    char studentType;

    public Student(){
        studentID = 10;
        studentType = 'F';
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }
}
