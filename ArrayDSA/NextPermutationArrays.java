package ArrayDSA;
import java.util.Arrays;

public class NextPermutationArrays { 


     public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};

        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));


        

    }
    
    public static void nextPermutation(int[] arr){
       int n = arr.length;
        int index = -1;

        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
            
        }
        if(index==-1){
             reverse(arr,0,n-1);
             return;
        }
        for (int i = n-1; i>index; i--) {
            if(arr[i]>arr[index]){
                swap(arr,index,i);
                break;
            }
        }

        reverse(arr, index+1, n-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }        
}





