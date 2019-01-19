package AdvancedLab.Assignment11;

public class Wells {

    public static void main(String[] args) {

        EmployeeGrade[] arr = new EmployeeGrade[5];
        int n = arr.length;

        //this will save the same value for all the objects.
        for (int i = 0; i < n; i++) {
            arr[i] = new EmployeeGrade(10, "Elvis", 4.1f, 4.2f, 4.3f);
        }

    }
}
