package ArrayDSA;

public class SearchInArray {
    public static void main(String[] args) {
        int[][] num = {{3,4,7,9}, {12,13,16,18},{20,21,23,29}};
        System.out.println(optimalSolution(num, 3));
    }

    private static boolean SearchIn2DArray(int[][] arr) {
        int target = 9;
        
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) { 
            if(arr[i][0]<=target && target<=arr[i][m-1]){ 
                return binarySearch(arr[i],target);
            }
            
        }
        return false;
        

    }

    private static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] <target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;

        
    }

    public static boolean optimalSolution(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;
        int start =0;
        int end = (n*m)-1;

        while (start<=end) {
            int mid = (start+end)/2;
            int row= mid/m;
            int col = mid%m;
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;


    }

    
}
