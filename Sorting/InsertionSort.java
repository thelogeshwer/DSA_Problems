package BinarySearch;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        sorting(arr);
    }

    private static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                int index = i;
                while(index>=1 && arr[index]<arr[index-1]  ){
                    int temp = arr[index-1];
                    arr[index-1]=arr[index];
                    arr[index]=temp;
                    index--;
                }
        }
        System.out.println(Arrays.toString(arr));
        
    }


    
    private static void insertionSort(int[] arr, int n) {//recursion method 
        if(n>=arr.length) return;
            int idx = n;
            while(idx>=1 && arr[idx]<arr[idx-1]){
                swap(arr, idx, idx-1);
                idx--;       
            }    
        insertionSort(arr, n+1);  
        return;      
        
    }

     private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    
}
