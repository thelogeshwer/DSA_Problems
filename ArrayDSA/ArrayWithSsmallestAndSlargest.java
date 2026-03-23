package ArrayDSA;

public class ArrayWithSsmallestAndSlargest {
    public static void main(String[] args) {
        int[] arr = {7,4,2,5,1,7};

        int n = arr.length;

        int slargest = sLargest(arr, n);
        int ssmallest = sSmallest(arr, n);

        System.out.println(slargest);
        System.out.println(ssmallest);
    }

    private static int sSmallest(int[] arr, int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
                
            } 
            else if(arr[i] > smallest && arr[i] < ssmallest){
                ssmallest = arr[i];

            }
        }
        return ssmallest;

       
    }

    private static int sLargest(int[] arr, int n) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                slargest= largest;
                largest= arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest ){
                slargest = arr[i];
            }
        
            
        }
        return slargest;
    }

    /////////////////////below will allow duplicates, above will filter duplicate////////////

    public static int MinMaxAllowDuplicate(int[] arr){
    int largest = Integer.MIN_VALUE;
    int slargest = Integer.MIN_VALUE;
    for (int n : arr) {
        if(n > largest){
            slargest = largest;
            largest = n;
        }
        else if(n > slargest){
            slargest = n;
        }
    }
    return slargest;
    }

    
}
