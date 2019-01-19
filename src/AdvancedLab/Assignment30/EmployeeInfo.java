package AdvancedLab.Assignment30;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class EmployeeInfo {

    public static void main(String[] args) {
        ArrayList<EmployeeBean> al = new ArrayList<>();
        EmployeeBean e1 = new EmployeeBean(10, "Kush", "12-12-1990");
        EmployeeBean e2 = new EmployeeBean(11, "Manu", "12-13-1990");
        EmployeeBean e3 = new EmployeeBean(12, "Anil", "12-14-1990");

        al.add(e1);
        al.add(e2);
        al.add(e3);
        Iterator <EmployeeBean> itr = al.iterator();
        while(itr.hasNext()){
            Object elem = itr.next();
            System.out.println(((EmployeeBean) elem).employeeId + " " + ((EmployeeBean) elem).employeeName + " " + ((EmployeeBean) elem).dob);
        }
    }
}
