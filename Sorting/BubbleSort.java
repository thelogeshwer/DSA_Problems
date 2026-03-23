package BinarySearch;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        optimal(arr);

    }
    static void optimal(int[] arr){
        for (int i = arr.length-1; i>0; i--) {
            boolean swap = false;
            for (int j = 0; j <i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr, int n) {// recursive
        if(n<2) return;
            for (int j = 0; j <=n-2; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
            bubbleSort(arr, n-1);
    }


    static void brute(int[] arr){
        int start = 0;
        int last = arr.length-1;
        while (start<last) {
            int i = start ;
            while(i<last){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
                i++;  
            } 
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    
}
