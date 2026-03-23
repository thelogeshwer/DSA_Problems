package BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,5,5,5,5};
        int n = arr.length;
        quickSort(arr,0, n-1);
        System.out.println(Arrays.toString(arr));
        
    }

  

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int partition = recurse(arr, low, high);
        quickSort(arr, low, partition-1);
        quickSort(arr, partition+1, high);     
    }



    private static int  recurse(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = low;

        while(i<j){
    // while( arr[i]<=arr[pivot] && i<high) {i++;}//its a wrong format while loop //so do while shines here
        //while( arr[j]>arr[pivot] && j>low) {j--;}//its a wrong format while loop

        //    while(i<=high- 1  ){
        //         if(arr[i]<=arr[pivot]) i++;// we use high +1 also
        //         else break;
        //         }
        //     while(j>=low+1 ){
        //         if(arr[j]>arr[pivot]) j--;// we use low+1 also
        //         else break;
        //     } 

           while( i<=high-1 && arr[i]<=arr[pivot] ) {i++;}// in while you use if, need to use break;
            while(j>=low+1 && arr[j]>arr[pivot] ) {j--;}
            if(i<j){
                swap(arr, i, j);                
            }
        }
        swap(arr, pivot, j);
        return j;
    }

    private static void swap(int[] arr , int i, int j ) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    
}
