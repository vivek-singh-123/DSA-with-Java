package Arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        //rows input
        for(int i=0; i<rows; i++) {
            //columns input
            for(int j=0; j<columns; j++) {
              numbers[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
