package ArrayDSA;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};

        System.out.println(optimalSolution(arr));
    }


    public static int bruteSolution(int[] arr){
        int n = arr.length;       
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>n/2) return arr[i];
                             
        }
        return -1;
    }

    public static int betterSolution(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> value = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            value.put(arr[i], value.getOrDefault(arr[i], 0)+1);         
        }
        for (Map.Entry<Integer, Integer> entry : value.entrySet()) {
            if (entry.getValue()> (n/2)) {
                return entry.getKey();
                
            }
            
        }
        return -1;
    }

    public static int optimalSolution(int[] arr){
        int n = arr.length;
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                element=arr[i];
                count++;
            }
            else{
                if(arr[i]!=element && count>0){
                    count--;
                }
                else{
                    count++;
                }
            }
                        
        }
        int cnt1= 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            return element;
        }
        else return-1;

    }
}
