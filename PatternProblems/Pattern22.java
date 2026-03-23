package BinarySearch;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= 2*n-1; i++) {
            for (int j = ; j <= 2*n-1 ; j++) {
                int up = i-1;
                int left = j-1;
                int down = (2*n-1)-i;
                int right = (2*n-1)-j;
                int ans = Integer.min(Integer.min(down, up),Integer.min(left, right));
                System.out.print(n-ans);
            }
            System.out.println();
            
        }

        
    }
    
}
