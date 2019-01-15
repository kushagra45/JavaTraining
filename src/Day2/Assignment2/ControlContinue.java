package Day2.Assignment2;

public class ControlContinue {

    public static void main(String[] args) {
        boolean bool = true;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(j + "\t");
                if(j > 5)
                    continue;
            }
            System.out.println("outer loop");
        }
        System.out.println("end");
    }

}
