package Day2.Assignment3;

public class SwitchCase {

    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("you have scored between 80 and 100, congratulations");
                break;
            case 'B':
                System.out.println("you have scored between 73 and 79");
                break;
            case 'C':
                System.out.println("you have scored between 65 and 72");
                break;
            case 'D':
                System.out.println("you have scored between 55 and 64");
                break;
            case 'E':
                System.out.println("you have scored less than 55");
                break;
            default:
                System.out.println("Grade does not exist");
            }

        System.out.println("Your grade is " + grade);
    }

}
