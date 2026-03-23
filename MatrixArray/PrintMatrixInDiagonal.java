package ArrayDSA;

import java.util.Arrays;

public class PrintMatrixInDiagonal {

    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};

        optimalSolution(arr);
    }

    private static void optimalSolution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int i= 0; int j=0;
        int count = 0;
        int up = 1;
        int[] narr = new int[n*m];
        while(count<(n*m)){
            if(up==1){
                while(i>=0 && j<m){
                    narr[count++]= arr[i][j];
                    if(j==m-1){
                        i++;
                        break;
                    }
                    else if(i==0){
                        j++;
                        break;
                    }
                    else{
                        i--; j++;
                    }
                }
                up=0;
            }
            else{
                while(i<n && j>=0){
                    narr[count++] = arr[i][j];
                    if(j==0){
                        i++;
                        break;
                    }
                    else if(i==n-1){
                        j++;
                        break;
                    }
                    else{
                        i++;
                        j--;
                    }
                }
                up=1;
            }
        }
        System.out.println(Arrays.toString(narr));
    }
    
}



                    
                     