package ArrayDSA;

public class SetMatZeroArray {
    public static void main(String[] args) {
        int[][] arr ={{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
        optimalSolution(arr);
        
    }

    private static void optimalSolution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int col =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }
                    else{
                        col=0;
                    }
                }
                
            }
            
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
            
        }

        if(arr[0][0]==0){
            for (int i = 0; i < m; i++) {
                arr[0][i]=0;
            }
        }

        if(col==0){
            for (int i = 0; i < n; i++) {
                arr[i][0]=0;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
    
}
