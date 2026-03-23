package BinarySearch;

import java.util.Arrays;

class FreqMostFreqEl {
    public static void main(String[] args) {
        int[] nums = {3,9,6};

        System.out.println(maxFrequency(nums,2));
    }

    public static  int maxFrequency(int[] nums, int k) {//optimal
        Arrays.sort(nums);

        int l = 0; int r = 0;
        long sum = 0;
        int ans = 1;
        while(r<=nums.length-1){
             sum = sum+nums[r];
            int winLen=r-l+1;
             long need = ((long)nums[r]*winLen)- sum;

            while(need>k && l<=r){
                sum = sum-nums[l];
                l++;
                winLen = r-l+1;
                 need = ((long)nums[r]*winLen)- sum;
            }

            ans = Integer.max(ans, winLen);
            r++;



        }
        return ans;
        
        
    }

    private static void maxFreq(int[] nums, int k ) {// brute force method;
        Arrays.sort(nums);
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            long prefix = 0;
            for (int j = i; j < nums.length; j++) {
                prefix=prefix+(long)nums[j];
                
                if((nums[j]* (j-i+1)) <= prefix+k){
                    ans = Integer.max(ans, j-i+1);
                }
                else{
                    break;
                }

                
                
            }
            
        }
        System.out.println(ans);
    }
}