package ArrayDSA;

public class ArrayDuplicatesRemove {

    public static void main(String[] args) {

        //need to find the length of array of unique elements.
        
        int[] arr = {1,2,2,2,3,3,3};

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);



    }
    
}
