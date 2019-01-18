package AdvancedLab.Assignment10;

public class Wells {

    public static void main(String[] args) {
        EmployeeGrade employeeGrade = new EmployeeGrade(101, "Ram", 4.1f, 4.0f, 4.3f);
        employeeGrade.calculateAverageFeedback();
        employeeGrade.displayInfo();

    }
}
