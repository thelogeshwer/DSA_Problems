package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    private static int  factorial(int n) {
        int i = 1;
        int ans = 1;
        return recurse(i,n, ans);
       
    }

    private static int recurse(int i, int n, int ans) {
        if(i>n){
            return ans;
        }


        ans = ans *i;
        i++;
        return recurse(i, n, ans);
        


    }
    
}
