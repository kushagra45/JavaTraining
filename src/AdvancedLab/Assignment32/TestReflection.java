package AdvancedLab.Assignment32;

import java.lang.reflect.*;
public class TestReflection {

    public static void main(String[] args) {
        try{
            Class classObj = Class.forName("AdvancedLab.Assignment32.EmployeeBean");
            System.out.println(classObj.getName());
            Method[] methObj = classObj.getMethods();
            for(Method method : methObj){
                System.out.println(method.getName());
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
