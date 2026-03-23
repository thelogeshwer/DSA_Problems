package AmazonDSAQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllPermutationInteger {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        List<List<Integer>> ans = new ArrayList<>();

        recursivePermutation(arr, ds, freq, ans);
        System.out.println(ans);




    }

    private static void recursivePermutation(int[] arr, List<Integer> ds, boolean[] freq,
     List<List<Integer>> ans) {

        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            //ans.add(ds);

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(!freq[i]){
                freq[i]= true;
                ds.add(arr[i]);
                recursivePermutation(arr, ds, freq, ans);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
            
        }
       
    }

}
