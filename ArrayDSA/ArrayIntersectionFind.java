package ArrayDSA;
import java.util.ArrayList;
import java.util.List;

public class ArrayIntersectionFind {
    public static void main(String[] args) {

        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};


        OptimalIntersectingSorted(arr1, arr2);
    }

    public static void IntersectingSorterArray(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        //List<Boolean> mark = new ArrayList<>();
        int[] mark = new int[n2];
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j= 0; j < n2; j++) {
                if(arr1[i]==arr2[j] && mark[j]!= 1){
                        temp.add(arr1[i]);
                        mark[j]=1;break;
                    
                    
                }
                ///it is sorted, so any case b[j]>a[i] you can break
                if(arr2[j]>arr1[i]) break;
                
            }
        }
        System.out.print(temp);
    }



    public static void OptimalIntersectingSorted(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int i =0;
        int j = 0;
        List<Integer> temp = new ArrayList<>();
        while (i<n1 && j<n2) {
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else {
                temp.add(arr1[i]);
                i++;j++;
            }
            
        }
        System.out.println(temp);
    }
    
}
