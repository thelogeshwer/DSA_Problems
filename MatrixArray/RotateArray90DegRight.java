package ArrayDSA;

public class RotateArray90DegRight {
    public static void main(String[] args) {
        int[][] arr = {{3,4,7}, {12,13,18},{20,23,29}};
       optimalSolution( arr);
        
    }

    private static void bruteSolution(int[][] arr) {
        int n= arr.length;
        int m = arr[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n-1-i]=arr[i][j];
            }
            
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
            
        }
    }


    public static void optimalSolution(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j < m; j++) {
                swap(arr,i,j);
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();

            
        }


    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int  temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    private static void swap(int[][] arr,int i, int j) {
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
        return;
    }

    
}
