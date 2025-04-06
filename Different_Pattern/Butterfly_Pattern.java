package Different_Pattern;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        int n=4;

        //upper half
        for(int i=1; i<=n; i++) {
            //first part *
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //top space
            int space=2*(n-i);
            for(int j=1; j<=space; j++) {
                    System.out.print(" ");
            }

            //second part *
            for(int j=1; j<=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }


        //lower half
        for(int i=n; i>=1; i--) {
            //first part *
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //bottom space
            int space=2*(n-i);
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }

            //second part *
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
