package ArrayDSA;

import java.util.HashMap;
import java.util.Map;

public class TrappingRainWater {
     public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0,2};
        System.out.println(bruteSolution(arr));

    }

    private static int bruteSolution(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] > left){
                    left=arr[j];
                }
            }
            int right = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>right){
                    right=arr[j];
                }
            }

            // if(left==i || right==i) {
            //     continue;
            // }
            int min = Integer.min(left, right);
            if(min>arr[i]) {
                count=count+(min-arr[i]);
            }
        }
        return count;
           
    }

    public static int betterSolution(int[] arr){
        int n = arr.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        int count=0;

        int premax = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixMax[i] =Integer.max(premax, arr[i]);
            premax= prefixMax[i]; 
        }

        int sumax = 0;
        for (int i = n-1; i >= 0; i--) {
            suffixMax[i] =Integer.max(sumax, arr[i]);
            sumax= suffixMax[i]; 
        }
        for (int i = 0; i < n; i++) {
            int min = Integer.min(prefixMax[i], suffixMax[i])-arr[i];
            count = count+min; 
        }
        return count;
    }


    public static int optimalSolution(int[] arr){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int lowmax = 0;
        int rightmax = 0;
        int count = 0;

        while(l<=r){
            if(arr[l]<=arr[r]){
                if(arr[l]<lowmax){
                    count=count+(lowmax-arr[l]);
                }
                else{
                    lowmax=arr[l];
                }
                l++;
            }
            else{
                if(arr[r]<rightmax){
                    count=count+(rightmax-arr[r]);
                }
                else{
                    rightmax=arr[r];
                }
                r--;
            }
        }
        return count;
    }


       
}
       

