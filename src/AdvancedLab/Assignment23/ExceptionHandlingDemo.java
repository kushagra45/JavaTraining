package AdvancedLab.Assignment23;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        String name = null;
        int total = 100, count = 0;
        try{
            int average = total / count;
            System.out.println(average);
            System.out.println(name.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("continuing the exception");
    }
}
