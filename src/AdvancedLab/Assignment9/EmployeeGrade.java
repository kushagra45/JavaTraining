package AdvancedLab.Assignment9;

public class EmployeeGrade {

    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;
    float avg;


    public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback){
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }

    public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback){
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
    }

    public void calculateAverageFeedback(EmployeeGrade employeeGrade){
        avg = (customer1Feedback + customer2Feedback + customer3Feedback) / 3;
        System.out.println(avg + " --> " + "this is the average for " + employeeGrade.employeeName);
    }

    public void calculateGrade(){

    }


}
