package JavaBasics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Comparator {

    public static void main(String[] args) {
        List<Integer> collection = Arrays.asList(23,45,44,22,46);

        Collections.sort(collection, (Integer a, Integer b) -> (a>b)?-1:1 );

        System.out.println(collection);

        collection.sort((a,b) -> a>b? 1 : -1);
        System.out.println(collection);

        

       

        
        
    }

    

}
