package ArrayDSA;


public class FindMissingNumber {

    public static void main(String[] args) {
        
        int[] arr={4,3,6,2,1,1};

        optimalFindMissingNumber(arr);
        
    }

    /////brute/////
    private static void findMissingNumber(int[] arr) {
        int repeat = -1;
        int missing =-1;

        for (int i = 1; i <= arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){
                    count++;
                }
            }
            if(count==2){repeat=i;}
            if(count==0){missing=i;}
        }
        System.out.println(repeat);
        System.out.println(missing);

    }

    //////Better//// 
    private static void BetterFindMissingNumber(int[] arr){
        int repeat = -1;
        int missing =-1;
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int i = 1; i < temp.length; i++) {
            if(temp[i]==2){
                repeat=i;
            }
            if(temp[i]==0){
                missing=i;
            }
            
        }
        System.out.println(repeat);
        System.out.println(missing);
    }


    ////Optimal
    
    public static void optimalFindMissingNumber(int[] arr){
        int n = arr.length;
        long  SN= n*(n+1)/2;
        long S2N = n*(n+1)*(2*n+1)/6;
        long S1 = 0;
        long S2 =0;
        for (int i = 0; i < arr.length; i++) {
            S1 =S1+arr[i];
            S2= S2 + ((long)arr[i]*(long)arr[i]);            
        }
        long val1= S1-SN; ////x-y
        long val2 = S2-S2N; ////(x+y)(x-y)

        val2=val2/val1; ////x+y

        long x = (val1+val2)/2;
        long y = val2-x;

        System.out.println(x);
        System.out.println(y);
    }

}

    
    

