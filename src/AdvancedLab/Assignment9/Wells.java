package AdvancedLab.Assignment9;

public class Wells {

    public static void main(String[] args) {

        EmployeeGrade elvis = new EmployeeGrade();
        elvis.initializeEmployee(10, "Elvis", 4.1f, 3.9f, 4.2f);
        elvis.calculateAverageFeedback(elvis);

        EmployeeGrade Martha = new EmployeeGrade();
        Martha.initializeEmployee(11, "Martha", 4.2f, 4.4f);
        Martha.calculateAverageFeedback(Martha);
    }

}
