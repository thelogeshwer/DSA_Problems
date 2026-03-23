package BinarySearch;

public class Pattern19 {
    public static void main(String[] args) {
         int n = 5;
        int spaces =0;
        for (int i = 0; i < n; i++) {
            //star
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j <(2*n)-2*(n-i) ; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }

            System.out.println();
            //spaces+=2;

        }
        
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }


            System.out.println();
            //spaces+=2;

        }
    }
    
}
