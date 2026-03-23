package AmazonDSAQuestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class SortByFreqAndValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }


        List<List<Integer>> output = groupSort(arr);
        for (List<Integer> i : output) {
            System.out.println(i.get(0)+ " " + i.get(1));
            
        }


        
    }

    public static List<List<Integer>> groupSort(int[] arr){
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }

        result.sort((a,b) -> {
            if(!Objects.equals(a.get(1), b.get(1))){
                return b.get(1) - a.get(1);
            }
            return a.get(0)-b.get(0);
        });

        return result;
    }




    

}
