package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        bruteSolution(arr);
    }

    private static void  bruteSolution(int[] arr) {
        int n = arr.length;
        mergeSort(arr, 0 , n-1);

        System.out.println(Arrays.toString(arr));
       
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        sorting(arr, low, high, mid);
        

    }

     static void sorting(int[] arr, int low, int high, int mid){
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while (left<=mid && right <=high) {
            if(arr[left]<= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }  
        }
        while(left<=mid){
                temp.add(arr[left]);
                left++;
            }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <=high; i++) {
            arr[i]= temp.get(i-low);
        }

    }

}
    

