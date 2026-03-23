package ArrayDSA;

import java.util.Arrays;

public class TwoPointerArray {
    public static void main(String[] args) {

         int arr[] ={8 ,0 ,5 ,10, 8, 6, -3, 4};
         Arrays.sort(arr);
         
         System.out.println(twoPointerArrayString(arr));

        

    }
// two element added, answer is to hit target;

    public  static String twoPointerArrayString(int[] arr){
        int target=9;
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int sum = arr[left]+ arr[right];
            if(sum == target) return "yes";
            else if(sum < target) left++;
            else right--;

        }
        return "No";
    }
    
}
