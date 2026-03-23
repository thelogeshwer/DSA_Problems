package ArrayDSA;

public class RowWithMaximum1s {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0},
    {0, 0, 1, 1},
    {0,0,0, 1},
    {1, 1, 1, 1}};
        System.out.println(rowWithMinimum1s(arr));
    }

    private static int rowWithMinimum1s(int[][] arr) {//unordered elements
        int n = arr.length;
        int m = arr[0].length;
        int mincount = Integer.MAX_VALUE;
        int row = -1;

        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count<mincount){
                mincount=count;
                row=i;
            }
            
        }
        return row;
        
        
    }




    public static int optimalSolution(int[][] arr){//works only for ordered elements
        int n = arr.length;
        int m = arr[0].length;
        int maxcount= 0;
        int row = -1;

        for (int i = 0; i < n; i++) {
            int index = lowbound(arr[i]);
            int count = m-index;
            if(count>maxcount){
                maxcount=count;
                row=i;
            }
        }
        return row;
        
       
    }
        
    private static int lowbound(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int index = arr.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=1){
                index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return index;
                
    }
}
