package ArrayDSA;

public class KElement2Sorted {

    public static void main(String[] args) {
        int[] arr1 =  {-5, 3, 6, 12, 15};
        int[] arr2 = {-12, -10, -6, -3, 4, 10};

        System.out.println(optimal(arr1,arr2));
        
    }

    private static int optimal(int[] arr1, int[] arr2) {
        int k = 7;
        int n1 = arr1.length;
        int n2= arr2.length;

        if(n1>n2) return optimal(arr2, arr1);
         int low = Integer.max(0,k-n2);
         int high = Integer.min(k,n1);
         while(low<=high){
            int cut1 = low+high / 2;
            int cut2 = k-cut1;

            int l1 = cut1==0? Integer.MIN_VALUE : arr1[cut1-1];
            int l2 =  cut2==0? Integer.MIN_VALUE : arr2[cut2-1];
            int r1= cut1==n1? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2==n2? Integer.MAX_VALUE : arr2[cut2];

            if(l1<r2 && l2<r1){
                 return Integer.max(l1, l2);
            }
            else if (l1>r2){
                high=cut1-1;

            }
            else low = cut1+1;


         }
         return 0;

    } 
    
}
