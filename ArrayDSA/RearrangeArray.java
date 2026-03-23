package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4,-6};
        optimalIsBruteMethod(arr);
    }

        //for brute take DS  store +ve and -Ve seperate, and put it in array

    public static void optimalIsBruteMethod(int [] arr){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){positive.add(arr[i]);}
            else {negative.add(arr[i]);}
        }
        int len =0; boolean flag=true;

        if(positive.size()<negative.size()){
            for (int i = 0; i < positive.size(); i++) {
            arr[i*2]=positive.get(i);
            arr[(i*2)+1]=negative.get(i);
            }

            int index = positive.size()*2;
            for (int i = positive.size(); i < negative.size(); i++) {
            arr[index]=negative.get(i); 
            index++;
            }
            
        }
        else {
            for (int i = 0; i < negative.size(); i++) {
            arr[i*2]=positive.get(i);
            arr[(i*2)+1]=negative.get(i);
            }

            int index = negative.size()*2;
            for (int i = negative.size(); i < positive.size(); i++) {
            arr[index]=positive.get(i); 
            index++;
            }
            
        }
        System.out.println(Arrays.toString(arr));


    }


    public int[] rearrangeArray(int[] nums) { //better approach
        //positive
        int positive =0;
        int negative = 1;
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
           if(nums[i]>0){
                ans[positive]=nums[i];
                positive+=2;
           }
           else{
            ans[negative]=nums[i];
            negative+=2;
           }
        }
        return nums;

    
}   

    
}
