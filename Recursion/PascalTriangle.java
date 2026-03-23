package Recursion;

import java.util.ArrayList;

public class PascalTriangle {
     public static void main(String[] args) {
        int r =4;
        int c = 2;

        //System.out.println(pascalTriangle(r-1,c-1));
        //pascalTriangle2brute(5);
        fullPascalTriangle2optimal(4);
    }

    public static int pascalTrianglePerElement(int n , int r) {//ans = particulat element
        int res = 1;
        for(int i = 0; i<r; i++){
            res= res*(n-i);
            res = res/(i+1);
        }
        return res;
    } 
///////////////////////brute method//////////////////////////////
    public static void pascalTriangle2brute(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(pascalTrianglePerElement(n-1, i-1)); 
        }
        System.out.println(ans);
    }
///////////////////////////////optimal////////////////////////
    public static void pascalTriangle2optimal(int row){
        int ans = 1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(ans);
        for (int i = 1; i < row; i++) {
            ans  = ans * (row-i);
            ans = ans/i;
            res.add(ans);
        }
        System.out.println(res);
    }
////////////////////////////recursion///////////////////
    public static void  pascalTriangle2Recurse(int row){
        int ans = 1;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(ans);
        recurse(row,1,ans, res);
        System.out.println(res);

    }

    private static void recurse(int row, int i,int ans,ArrayList<Integer> res) {
        if(i==row){
            return;
        }

        ans  = ans * (row-i);
        ans = ans/i;
        res.add(ans);
        recurse(row, i+1, ans, res);
        return;
    }

//////////////print all the pass triangle, code not writter becaiyse easy.
/// 
/// 
     public static void fullPascalTriangle2optimal(int row){
        
        for (int i = 1; i <= row; i++) {
            int ans = 1;
            System.out.print(ans);
            for (int j = 1; j < i; j++) {
                ans  = ans * (i-j);
                ans = ans/j;
                System.out.print(ans);
            }
            System.out.println();
        }
        
            
    }
        
}







   

     
    

