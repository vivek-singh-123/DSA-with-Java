// Enter 3 numbers from the user & make a
// function to print their average...

package Different_Pattern;

import java.util.Scanner;

public class Print_Average {

    public static double average(int a, int b, int c) {
        double averageOfNumbers = (a + b + c) / 3.0;
        return averageOfNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        double averageValue = average(a, b, c);


        System.out.println("The average is: " + averageValue);
    }
}
