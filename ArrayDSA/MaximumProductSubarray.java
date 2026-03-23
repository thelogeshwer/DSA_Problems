package ArrayDSA;



public class MaximumProductSubarray {
    public static void main(String[] args) {
        int [] arr = {2,3,-2,4};
        System.out.println(optimalSolution(arr));
    }

    private static int optimalSolution(int[] arr) {
        int n = arr.length;
        int prefix = 1;
        int suffix = 1;
        int maxprod= Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if(prefix==0) {
                prefix=1;
            }
            if(suffix==0) {
                suffix=1;
            }

            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            maxprod=Integer.max(maxprod, Integer.max(prefix,suffix));
            
        }
        return maxprod;
        
    }
        
            
    



}

    
    

