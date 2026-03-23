package BinarySearch;

public class Pattern11 {
    public static void main(String[] args) {//it work for smaller data set, 
                                             //for larger data set it will struck.
        int n = 5;
        // for (int i = 1; i <=n ; i++) {
        //     for (int j = i; j>0; j--) {
        //         System.out.print(j%2);             
        //     }
        //     System.out.println(); 
        // }


        for (int i = 0; i < n; i++) {//correct wary of code., always try run forloop from 0.
            int start = i;
            if(start %2==0){
                start = 1;
            }
            else start =0;
            for (int j = 0; j <=i ; j++) {
                System.out.print(start);
                start = 1-start;
                
            }
            System.out.println();
            
        }
    }
    
}
