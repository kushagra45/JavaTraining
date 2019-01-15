package Day3.Assignment2;

public class DemoArray {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 1, 1}};
        int[][] arr2 = {{2, 2, 2}, {2, 2, 2}};

        System.out.println("Printing array 1");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing array 2");
        System.out.println("Hello");
        for(int j = 0; j < arr2.length; j++){
            for(int k = 0; k < arr2[0].length; k++){
                System.out.print(arr2[j][k] + " ");
            }
            System.out.println(" ");
        }


    }
}
