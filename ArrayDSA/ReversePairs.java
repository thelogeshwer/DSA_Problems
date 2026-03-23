package BinarySearch;

import java.util.ArrayList;
import java.util.List;

class ReversePairs {
    public int reversePairs(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int low = 0;
        int high =arr.length-1;
        int count = 0;
        count+=recurse(arr, low, high);
        return count;

        
    }

    static int recurse(int[] arr, int low, int high){
        if(low>=high) return 0;

        int mid = (low+high)/2;
        int count =0;
        count+=recurse(arr, low, mid);
        count+=recurse(arr, mid+1, high);
        count+=countPairs(arr, low, mid, high);
        sorting(arr, low,mid, high);
        return count;

    }

    static int countPairs(int[] arr, int low, int mid , int high){
        int right = mid+1;
        int count = 0;
        for(int i=low; i<=mid; i++){
            while(right<=high && arr[i]> 2L*arr[right]) right++;
            count+= (right- (mid+1));
        }
        return count;
    }

    static void sorting(int[] arr, int low, int mid , int high ){
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