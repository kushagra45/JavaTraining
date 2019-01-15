package Day3.Assignment5;

import java.util.*;

public class JavaDoc{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name");
        String myString = input.next();

        System.out.println("Entered name is " + myString);
        System.out.println("Length of the name is " + myString.length());
        System.out.println("Hi" + " " + myString);
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        if(myString.startsWith("a"))
            System.out.println("Yes, the name is starting with a");
        else
            System.out.println("No, the name is not starting with a");

        myString = "Krishna";
        System.out.println(myString);

    }
}