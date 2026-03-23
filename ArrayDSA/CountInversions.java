package ArrayDSA;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
         System.out.println(optimalSolution(arr));
    }

    private static int optimalSolution(int[] arr) {
        int n = arr.length;
        return divideRecursion(arr,0, n-1);
    }

    private static int divideRecursion(int[] arr, int low, int high) {
        int count = 0;
        if(low>=high) return count;
        int mid = (low+high)/2;
       count=count+ divideRecursion(arr, low, mid);
        count=count+ divideRecursion(arr, mid+1, high);
        count=count+ mergeSort(arr, low, mid, high);
        return count;
        
    }

    private static int  mergeSort(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        int count=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count = count + (mid-left+1);
                right++;

            }
        }
        

        while (left<=mid) {
            temp.add(arr[left]);
            left++;
            
        }

        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <=high; i++) {
            arr[i]=temp.get(i-low);
        }
        return count;     
    }

    
}
