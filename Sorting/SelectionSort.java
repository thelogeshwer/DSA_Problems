package BinarySearch;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        int n = arr.length;
        for(int i = 0; i<=n-2; i++){
            int minIndex =i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr, i, minIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int place, int minIndex) {
        if(place==minIndex) return;
        int temp =arr[place];
        arr[place] = arr[minIndex];
        arr[minIndex] = temp;
    }
    

    
    
    
}
