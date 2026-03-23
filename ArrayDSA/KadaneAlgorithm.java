package ArrayDSA;
public class KadaneAlgorithm{
    public static void main(String[] args) {
        
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        //System.out.println(bruteKadanesAlgorithm(arr));
        //System.out.println(betterKadanesAlgorithm(arr));
        optimalKadanesAlgorithm(arr);


        }
    //Brute force method of Kadane's Algorithm

    public static int bruteKadanesAlgorithm(int[] arr){
        int maximum =  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum=sum+arr[k];
                }
                maximum=Integer.max(maximum, sum);

                
            }
        }
        return maximum;
        
    }

    //Better solution for kadanes algorithm

    public static int betterKadanesAlgorithm(int[] arr){
        int maximum =  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {   
                sum=sum+arr[j];
                maximum=Integer.max(maximum, sum);

                
            }
        }
        return maximum;
        
    }

    //Optimal kadanes algo
     public static void optimalKadanesAlgorithm(int[] arr){
        int maxsu = Integer.MIN_VALUE;
        int sum = 0;
        int ansstart = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {

            if(sum==0){
                sum = sum+arr[i];   
                start = i;
            }
            
            if(sum>maxsu){
                maxsu=sum;
                ansstart=i;

                end = i;
            }

            if(sum<0){
                sum = 0;
            }
        }
        for (int i = ansstart; i <=end; i++) {
                System.out.print(arr[i]+ " ");
            
        }
             
        
        
        
    }
}
