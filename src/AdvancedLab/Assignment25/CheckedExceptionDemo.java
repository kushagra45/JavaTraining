package AdvancedLab.Assignment25;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try{
            Class.forName("ExceptionDemo");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception found in " + e);
        }
    }
}
