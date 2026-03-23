package ArrayDSA;

import java.util.HashMap;

public class LongestSubArrayKSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        System.out.println(optimalSolution(arr, 6));

    }
    

    public static int longestSubarray(int[] arr, int m) { //or we can use 3 for loops also but that is TC n^3 --->TC exceeded
        int n = arr.length;
        int max = Integer.MIN_VALUE;
            for (int i =0; i<n; i++){
                int sum = 0;
                for(int j=i; j<n; j++){
                    sum=sum+arr[j];
                    if(sum==m){
                        max = Integer.max(max, (j-i+1));
                    }

                }
            }   
            return max;        
    }

    public static int betterSolution(int[] arr, int m){/////TC 1.45sec
        int n = arr.length;
        HashMap<Integer,Integer> values = new HashMap<>();
        int sum =0;
        int length = 0;
        for (int i = 0; i <n; i++) {
           sum=sum+arr[i];
           if(sum==m){
            length = Integer.max(length, i+1);
           }
           int rem = sum-m;
           if(values.containsKey(rem)){
            int tempLen= i-values.get(rem);
            length=Integer.max(length, tempLen);
           }
           if(!values.containsKey(sum)){
            values.put(sum, i); 
           }
           
        }
        return length;
    }


    public static int optimalSolution(int[] arr, int m){////won't work when array has negative values
        int n = arr.length;
        int right = 0;
        int left = 0;
        int maxLen=0;
        int sum =arr[0];

        while(right<n){
            while(left<=right && sum>m){
                sum = sum-arr[left];
                left++;
            }
            if(sum==m){
                int temp = right+1-left;
                maxLen = Integer.max(maxLen, temp);
            }
            
            right++;
            if(right<n){
                sum=sum+arr[right];    
            }
            
        }
        return maxLen; 
    }

}

