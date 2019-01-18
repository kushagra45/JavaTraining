package Day4.Assignment5;

public class PostGradStudent extends Student {

    private int postCourseId;
    private String postCourseName;
    private int postCourseFees;

    public PostGradStudent(int id, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees) {
        super(id, studentType, studentName);
        this.postCourseId = postCourseId;
        this.postCourseName = postCourseName;
        this.postCourseFees = postCourseFees;
    }

    public int getPostCourseId() {
        return postCourseId;
    }

    public int getPostCourseFees() {
        return postCourseFees;
    }

    public String getPostCourseName() {
        return postCourseName;
    }

}
