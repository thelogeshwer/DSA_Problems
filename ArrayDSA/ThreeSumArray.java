package ArrayDSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSumArray {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
       // System.out.println(frequencyCount(arr));
        //System.out.println(BetterApproach(arr));
        System.out.println(optimalApproach(arr));

    }


    public  static List<List<Integer>> frequencyCount(int[] arr) {
        int target = 13;
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    if(arr[i]+arr[j]+arr[k]==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        st.add(temp);   
                    }
                } 
            }
        }
        ans.addAll(st);
        return ans;
    }


    public static List<List<Integer>> BetterApproach(int[] arr){

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> tempStore = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int third = -(arr[i]+arr[j]);///arr[k]= -(arr[i]+arr[j])
                if(tempStore.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                tempStore.add(arr[j]);
                
                
            }
            
        }
        ans.addAll(st);
        return ans;
    }

    public static List<List<Integer>> optimalApproach(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum =arr[i]+arr[j]+arr[k]; 
                if(sum>0){
                    k--;
                   while(j<k && arr[k]==arr[k+1]) k--;
                }
                else if (sum<0){
                    j++;
                   while(j<k && arr[j]==arr[j-1]) j++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1])k++;

                }
            }
            
        }
        return ans;
    }

}
