package ArrayDSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTargetedValueInArray {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(
            Arrays.asList(3,4,7,8),
            Arrays.asList(12,13,15,20),
            Arrays.asList(25,31,37,40)
        ));


        System.out.println(SearchIn2DArray(matrix));
       


        

        
        
    }

    public static boolean SearchIn2DArray(List<List<Integer>> matrix){
        int n = matrix.size(); int m = matrix.get(0).size();
        int target = 15;
        int low=0; int high= n*m -1;
        while(low<=high){
            int mid = (low+high)/2;
            int row=mid/m; int col=mid%m;
            if(matrix.get(row).get(col) == target) return true;
            else if(matrix.get(row).get(col) < target){
                 low= mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return false;

    

        

    }

    
}
