package Day2.Assignment7;

import Day2.Assignment4.Student;

public class PassByValue {

    public static void main(String[] args) {
        int sId = 25;
        PassByValue passByValue = new PassByValue();
        Student student1 = new Student();
        //System.out.println(sId);
        passByValue.passTheValueMethod(sId);
        System.out.println("the sId are " + sId);
    }

    public void passTheValueMethod(int sid){
        sid = 10;
        System.out.println("The sid are " + sid);
    }
}
