package ArrayDSA;
import java.util.Arrays;


public class RotateArrayByDPlaces {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        //ArrMaxMin(arr); 
        RotateFuncByKElementsRight(arr);     
    }


    /////////brute force/////

    public static void RotateArrayDElementLeft(int[] arr){
        int d = 5;
        //d=d%2;
        int n=arr.length;
        int[] temp= new int[d];
        for (int i = 0; i < d;  i++) {
            temp[i]=arr[i];
        }
        /////shifting/////////
        for (int i = d; i <n ; i++) {
            arr[i-d]= arr[i];            
        }
        ////fill temp in empty places///
        for (int i = n-d; i < n; i++) {
            arr[i]=temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));
        
    }

    ///Optimal solution///

    public static void RotateFuncByDElementsLeft(int[] arr) {
        int d =5;
        int n =arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverse(int[] arr, int start, int end){
        while(start <= end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }



    public static void RotateByDElementsRight(int[] arr){
        int n=arr.length;
        int d=5;
        int[] temp = new int[d];
        ///create d space for shift and store in temp array
        for (int i = d-1; i < n; i++) {
             temp[i-(d-1)] = arr[i];           
        }
        ///shifting
        for (int i = 0; i <(n-d) ; i++) {
            arr[i+d]= arr[i];
        }
        ////filling d places after shifting
        for (int i = 0; i < d; i++) {
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void RotateFuncByKElementsRight(int[] arr){
        int d =5;
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));

    }


}




