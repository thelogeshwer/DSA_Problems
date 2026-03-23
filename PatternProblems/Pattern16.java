package BinarySearch;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        // for (char ch='A'; ch<'A'+n; ch++ ) {//why this much tough in writing code.
        //     for (char nch ='A'; nch<=ch; nch++) {
        //         System.out.print(ch);
        //     }
        //     System.out.println();    
        // }


        for (int i = 0; i < n; i++) {
            char ch = (char)('A'+ i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                
            }
            System.out.println();
            
        }
    }
    
}
