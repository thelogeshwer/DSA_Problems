package BinarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(optimal(arr));
    }


    static int optimal(int[] arr){// for larger data set it will not work
        if(arr.length==0) return 0;
        int longest=0;
        HashSet<Integer> ds = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            ds.add(arr[i]);
        }
        for(int num : arr){
            if(!ds.contains(num-1)){
                int count=1;int x = num;
                while(ds.contains(x+1)){
                    count++;
                    x+=1;
                }
                longest = Integer.max(longest,count);
            }
        }
        return longest;
    }


    static void better(int[] arr){
        Arrays.sort(arr);
        int count =0;
        int longest = 1;
        int lastsmaller=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1 ==lastsmaller){
                count++;
                lastsmaller=arr[i];
            }
            else if(arr[i]!=lastsmaller){
                    count=1;
                    lastsmaller=arr[i]; 
                
            }
            longest=Integer.max(longest, count);

        }
        System.out.println(longest);

    }

    // static void better(int[] arr){//my version code quality is poor
    //     Arrays.sort(arr);
    //     int count =0;
    //     int longest = 1;
    //     int lastsmaller=Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]==lastsmaller) continue;
    //         if(arr[i]-1 !=lastsmaller){
    //             count =1;
    //             lastsmaller=arr[i];
    //         }
    //         else{
    //             if(arr[i]-1 == lastsmaller){
    //                 count++;
    //                 lastsmaller=arr[i];
    //             }
                
    //         }
    //         longest=Integer.max(longest, count);

    //     }
    //     System.out.println(longest);

    // }






    private static void brute(int[] arr) {
        int longest =0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int x = arr[i];
            while(ls(arr,x)==true){
                count++;
                x+=1;
            }
            longest=Integer.max(count, longest);   
        }
        System.out.println(longest);
    }

    private static boolean ls(int[] arr, int x) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]== x+1){
                return true;
            }
        }
        return false;
    }
}
