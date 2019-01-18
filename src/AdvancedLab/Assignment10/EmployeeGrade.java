package AdvancedLab.Assignment10;

public class EmployeeGrade {

    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grad;
    float avg;

    public EmployeeGrade(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
        this.averageFeedback = averageFeedback;
        this.grad = grad;
    }

    public void calculateAverageFeedback(){
        avg = (customer1Feedback + customer2Feedback + customer3Feedback) / 3;
        System.out.println(avg);
    }

    public void calculateGrade(){

    }

    public void displayInfo(){
        System.out.println(employeeName + " " + employeeNo + " " + averageFeedback);
    }





}
