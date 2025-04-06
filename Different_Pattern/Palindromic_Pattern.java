package Different_Pattern;

public class Palindromic_Pattern {
    public static void main(String[] args) {
        int n=6;

        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //left side number
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //right side number
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
