package ArrayDSA;

public class RotateArray90DegLeft {
    public static void main(String[] args) {
        int[][] arr={{0,1,2},{3,4,5},{6,7,8}};
        optimalSolution(arr);
    }

    private static void optimalSolution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j < m; j++) {
                swap(arr, i, j);
                
            }
            
        }

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[n-1-i][j];
                arr[n-1-i][j] = temp;
                
            }
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] +" ");
                
            }
            System.out.println();
            
        }
        
    }



    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }





    


}
