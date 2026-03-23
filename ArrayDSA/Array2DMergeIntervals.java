package ArrayDSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2DMergeIntervals {
    public static void main(String[] args) {

       List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1, 3));
        intervals.add(Arrays.asList(2, 6));
        intervals.add(Arrays.asList(8, 9));
        intervals.add(Arrays.asList(9, 11));
        intervals.add(Arrays.asList(8, 10));
        intervals.add(Arrays.asList(2, 4));
        intervals.add(Arrays.asList(15, 18));
        intervals.add(Arrays.asList(16, 17));

        System.out.println(mergeOverlappingIntervals(intervals));

        System.out.println(optimalMergeOverlappingIntervals(intervals));


    }


    public static List<List<Integer>> mergeOverlappingIntervals(List<List<Integer>> intervals ){
        List<List<Integer>> answer=new ArrayList<>();
        intervals.sort((a,b)-> Integer.compare(a.get(0), b.get(0)));

        for (int i = 0; i < intervals.size(); i++) {
        int start = intervals.get(i).get(0);
        int end = intervals.get(i).get(1);
        if(!answer.isEmpty() && end<=answer.get(answer.size()-1).get(1)){
            continue;
        }   

        for (int j = i+1; j < intervals.size(); j++) {
            if(intervals.get(j).get(0) <= end){
                end= Integer.max(end, intervals.get(j).get(1));
            }
            else{
                break;
            }            
        }
        answer.add(Arrays.asList(start,end));
        }
        return answer;       
    }    


    //it is the optimal case of the problem.

    public static List<List<Integer>> optimalMergeOverlappingIntervals(List<List<Integer>> intervals ){
        List<List<Integer>> answer = new ArrayList<>();
        intervals.sort((a,b)-> Integer.compare(a.get(0), b.get(0)));

        for (int i = 0; i < intervals.size(); i++) {

        if(answer.isEmpty() || intervals.get(i).get(0) > answer.get(answer.size()-1).get(1)){
            answer.add(intervals.get(i));
        }
        else{
            answer.get(answer.size()-1).set(1, Integer
                .max(answer.get(answer.size()-1).get(1), intervals.get(i).get(1)));
            
        }       
        }
        return answer; 
    }


    
    

}
