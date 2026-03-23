package ArrayDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumArray {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};

        //System.out.println(normalApproach(arr));
        //System.out.println(betterApproach(arr));
        System.out.println(optimalCode(arr));

    }

    public static List<List<Integer>> normalApproach(int[] arr){
        int n = arr.length;
        int target=0;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    for (int l = k+1; l < arr.length; l++) {
                        long sum = arr[i]+arr[j];
                        sum+=arr[k]+arr[l];
                        if(sum==target){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(arr[i]);temp.add(arr[j]);
                            temp.add(arr[k]);temp.add(arr[l]);
                            Collections.sort(temp);
                            st.add(temp); 
                        }                      
                    }
                }
            } 
        }
        ans.addAll(st);
        return ans;
    }

    public static List<List<Integer>> betterApproach(int[] arr){
        int n = arr.length;
        int target=0;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                Set<Integer> tempSet = new HashSet<>();
                for (int k = j+1; k < arr.length; k++) {
                    int fourth = target-(arr[i]+arr[j]+arr[k]);
                    if(tempSet.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    tempSet.add(arr[k]);
                }  
            } 
        }
        ans.addAll(st);
        return ans;
    }

    public static List<List<Integer>> optimalCode(int[] arr){
        int target =0;
        int n =arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);;
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            for (int j = i+1; j < arr.length; j++) {
                if(j != i+1 && arr[j]==arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = arr[i]+arr[j];
                    sum+=(arr[k]+arr[l]);
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while (k<l && arr[l]==arr[l+1]) l--;                        
                    }
                    else if(sum<target){
                        k++;
                        while(k<l && arr[k]==arr[k-1]) k++;
                    }
                    else{
                        l--;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                }
                
            }
        }
        return ans;
    }




}
