package ArrayDSA;

import java.util.Arrays;

public class RotateMatrixKTimes {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        optimalSolution(arr, 1);
        
    }

    public static void optimalSolution(int[][] arr,int d){ //less time more space
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
             int[] rotate = new int[m];
            for (int j = 0; j < m; j++) { 
                rotate[j]= arr[i][(j+d)%m];
            }
            arr[i]=rotate;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }




    private static void bruteSolution(int[][] arr, int d) {// it is O(n)*O(m)   more time less spaceo(1)
        int n = arr.length;
        int m = arr[0].length;
        d=d%m;

        for (int i = 0; i < n; i++) {
            reverse(arr[i],0,d-1);
            reverse(arr[i],d,m-1);
            reverse(arr[i],0,m-1);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }

        



    }

    private static void reverse(int[] arr, int start, int end) {//brute revse method

        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }
    
}
