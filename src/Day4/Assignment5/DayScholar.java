package Day4.Assignment5;

public class DayScholar extends PostGradStudent {

    private String residentialAddress;
    private int fees;

    public DayScholar(int id, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees, String residentialAddress) {
        super(id, studentType, studentName, postCourseId, postCourseName, postCourseFees);
        this.residentialAddress = residentialAddress;
    }

    public void calculateFees(){
        fees = getPostCourseFees() / 6;
    }

    public int getFees(){
        return fees;
    }

    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5, 'D', "Manu", 1001, "OOPS", 16000, "32 / 3 Vijaynagar" );
        System.out.println(dayScholar.getPostCourseId());
        System.out.println(dayScholar.getPostCourseFees());
        System.out.println(dayScholar.getPostCourseName());
        System.out.println(dayScholar.getClass());

    }
}
