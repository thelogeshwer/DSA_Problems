package JavaBasics;


import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, -5, 8, -9, -7);



        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int i : nums) {
            if(i >= 0){
                positives.add(i);
            }
            else negatives.add(i);
            
        }

        Collections.sort(positives);
        // Collections.sort(negatives);
        

        List<Integer> result = new ArrayList<>();

        result.addAll(positives);
        result.addAll(negatives);

        System.out.println(result);


        
      


    }
    
}
                                                                              