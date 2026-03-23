package ArrayDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};

        System.out.println(optimalSolution(arr));
    }

    private static void bruteSolution(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        ArrayList<int[]>  ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size()-1)[1]){
                continue;
            }

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j][0]<=end){
                    end = Integer.max(arr[j][1], end);
                }
                else{
                    break;
                }                
            }
            ans.add(new int[]{start,end});      
        }

        for (int[] num : ans) {
            System.out.print(Arrays.toString(num));
            
        }
    }

    public static int[][] optimalSolution(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(!ans.isEmpty() && arr[i][0] <= ans.get(ans.size()-1)[1]){
                
                    int[] lastInterval = ans.get(ans.size()-1);
                    lastInterval[1]=Integer.max(lastInterval[1], arr[i][1]);
            }
                
            else{
                    ans.add(new int[]{arr[i][0], arr[i][1]});
                }
                
            
            
        }
        for (int[] num : ans) {
            System.out.print(Arrays.toString(num));
            
        }
        //return ans.toArray(new int[ans.size()][]);
    }

}