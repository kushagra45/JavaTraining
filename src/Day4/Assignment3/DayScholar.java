package Day4.Assignment3;

public class DayScholar extends Student {

    private String residentialAddress;

    public DayScholar(){
    }

    public DayScholar(int id, char type, String name, double fees, String residentialAddress){
        super();
        this.residentialAddress = residentialAddress;
    }

    public void displayDayScholarDetails(){
        super.displayStudentDetails();
        System.out.println(residentialAddress);
    }

    public static void main(String[] args) {
        Student student = new Student();

    }
}
