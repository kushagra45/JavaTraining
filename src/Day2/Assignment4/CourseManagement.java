package Day2.Assignment4;

public class CourseManagement {

    public static void main(String[] args) {

        Student student = new Student();

        int temp_id =  student.getStudentID();
        char temp_type = student.getStudentType();

        System.out.println("Student id is " + temp_id);
        System.out.println("Student type is " + temp_type);
    }
}
