package ArrayDSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {

    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(
            Arrays.asList(1,1,1,1),
            Arrays.asList(1,0,1,1),
            Arrays.asList(1,1,0,1),
            Arrays.asList(0,1,1,1)
        ));
        
        System.out.println(matrix);

        //System.out.println(SetMatrixZeros(matrix));
        //System.out.println(BetterSetMatrixZeros(matrix));
        System.out.println(OptimalSetMatrixZeros(matrix));

    }


    public static List<List<Integer>> setMatrixZeros(List<List<Integer>> matrix){
        int n= matrix.size();
        int m = matrix.get(0).size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix.get(i).get(j)==0){
                    markRow(i, m, matrix);
                    markCol(j,n, matrix);
                }
                
            }
            
        }
        return finalLoop(m, n, matrix);
    }


    private static List<List<Integer>> markRow(int i, int m,List<List<Integer>> matrix) {
        for (int j = 0; j < m; j++) {
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j,-1);
            }
        }
        return matrix;
    }


    private static List<List<Integer>> markCol(int j, int n,List<List<Integer>> matrix) {
        for (int i = 0; i < n; i++) {
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
            
        }
        return matrix;
    }

    private static List<List<Integer>> finalLoop(int m, int n,List<List<Integer>> matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == -1){
                    matrix.get(i).set(j, 0);
                } 
            }   
        }
        return matrix;
    }

    //////////////////////////////////////Better Case//////////////////////////////////////////////////////
    
    public static List<List<Integer>> BetterSetMatrixZeros(List<List<Integer>> matrix){
        int n= matrix.size();
        int m = matrix.get(0).size();
        int[] row= new int[n];
        int[] col= new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    col[j]=1; 
                }
            }
        }
        return betterFinalLoop(m, n, matrix, row, col);
    }


    private static List<List<Integer>> betterFinalLoop(int m, int n,List<List<Integer>> matrix, int[] row,int[] col) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[i]==1 || col[j]==1){
                    matrix.get(i).set(j, 0);
                }
            }   
        }
        return matrix;
    }


    //////////////////////////////////////////////Optimal Case//////////////////////////////////////////////////
     
    public static List<List<Integer>> OptimalSetMatrixZeros(List<List<Integer>> matrix){
        int n= matrix.size();
        int m = matrix.get(0).size();
        int col0=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0);
                    if(j!=0){
                        matrix.get(0).set(j, 0);
                    }
                    else{
                        col0 = 0;    
                    }
                                        
                }
            }
        }
        return betterFinalLoop(m, n, matrix, col0);
    }


    private static List<List<Integer>> betterFinalLoop(int m, int n, List<List<Integer>> matrix, int col0) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                    matrix.get(i).set(j,0);
                }   
            } 
        }

        if(matrix.get(0).get(0)==0){
            for (int i = 0; i < m; i++) {
                matrix.get(0).set(i, 0);
            }
        }
        if(col0==0){
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
        
    }


}
