package ArrayDSA;
import java.util.HashMap;
import java.util.Map;

public class CheckEqualArray {
    public static void main(String[] args) {
        int[] arr1 ={1,2,5,4,0};
        int[] arr2 = {2,4,5,0,1};

       System.out.println(equalArray(arr1,arr2));





    }

    public static boolean  equalArray(int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        //if(n1!=n2) return false;
        Map<Integer,Integer> mark = new HashMap<>();
        int nonZeroCounter=0;
           
        for (int i=0; i<n1; i++) {
            int valArr1=mark.getOrDefault(arr1[i], 0)+1;
            mark.put(arr1[i], valArr1);
            if(valArr1==1){
                nonZeroCounter++;
            }
            else if(valArr1==0){
                nonZeroCounter--;
            }
            

            int valArr2 = mark.getOrDefault(arr2[i],0)-1;
            mark.put(arr2[i], valArr2);
            if(valArr2==0){
                nonZeroCounter--;
            }
            else if(valArr2==-1){
                nonZeroCounter++;
            }
            
        }

        
        if(nonZeroCounter==0){
            return true;
        }
        else return false;
        


    }



    
   
}
