package ArrayDSA;

import java.util.ArrayList;
import java.util.Collections;

public class AllPermutationToNextPer {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        int n = arr.length;
        boolean[] freq = new boolean[n];
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         optimalSolution(arr, freq,ds,ans,n);
         System.out.println(ans);

        sortAllPermutation(ans);
        System.out.println(ans);

        nextPermutation(ans,arr);
        
        
    }

    private static void nextPermutation(ArrayList<ArrayList<Integer>> ans, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]); 
        }

       int index = -1;
        if(ans.contains(list)){
            int ansindex = ans.indexOf(list);
            if(ansindex!=ans.size()-1){
                index=ansindex+1;
                System.out.println(ans.get(index));
            }            
        }
        else {
            System.out.println(ans.get(0));
        }

       
    }

    private static void sortAllPermutation(ArrayList<ArrayList<Integer>> ans) {
        int n = ans.get(0).size();
        Collections.sort(ans, (a,b)-> {
            for (int i = 0; i < n; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if(cmp!=0){
                    return cmp;
                }
            }
            return 0;
        });
    }

    private static void optimalSolution(int[] arr, boolean[] freq,ArrayList<Integer> ds,
    ArrayList<ArrayList<Integer>> ans, int n ) {
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < n; i++) {
            if(freq[i]!= true){
                freq[i]=true;
                ds.add(arr[i]);
                optimalSolution(arr, freq, ds, ans, n);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }
        
    }


    
    
}
