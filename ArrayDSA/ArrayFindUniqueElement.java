package ArrayDSA;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayFindUniqueElement {
    public static void main(String[] args) {

        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};

        UniqueElements(arr1, arr2);

        
    }




    public static void PlacesZeroAtLast(int [] arr1, int[] arr2){

        Set<Integer> temp = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            temp.add(arr1[i]);           
        }
        for (int j = 0; j < arr2.length; j++) {
            temp.add(arr2[j]);
        }
        for (int integer : temp) {
            System.out.print(integer);

            
        }
    }

    public static  void UniqueElements(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        List<Integer> union=new ArrayList<>();

        while (i<n1 && j<n2) {
            if(arr1[i]<=arr2[j]){
                if(union.isEmpty() || arr1[i] != union.get(union.size() - 1)){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.isEmpty() || arr2[j] != union.get(union.size() - 1)){
                    union.add(arr2[j]);
                }
                j++;
            }
            
        }
        while (i<n1) {
            if(union.isEmpty() || arr1[i] != union.get(union.size() - 1)){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(union.isEmpty() || arr2[j] != union.get(union.size() - 1)){
                union.add(arr2[j]);
            }
            j++;

        }
        System.out.println(union);
    }


    
    
}
