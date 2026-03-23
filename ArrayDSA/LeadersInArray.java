package BinarySearch;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {

        //Leaders in array
    }

    static ArrayList<Integer> leaders(int nums[]) {
        ArrayList<Integer> ds = new ArrayList<>();
        int rightmost = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]>=rightmost){
                ds.add(nums[i]);
                rightmost=nums[i];
            }
        }
        reverse(ds, 0,ds.size()-1);
        
        return ds;

    }
    
    static void reverse( ArrayList<Integer> ds, int start,int end){
        while(start<end){
            int temp = ds.get(start);
            ds.set(start,ds.get(end));
            ds.set(end,temp);
            start++;
            end--;
        }
        
    }
    
}
