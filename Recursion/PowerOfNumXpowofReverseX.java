package Recursion;
public class PowerOfNumXpowofReverseX {
    public static void main(String[] args) {
        int n = 10;
        System.out.println( reverseExponentiation( n));
    }

    private static int  reverseExponentiation(int n) {
        // it is TC-logn and SC-logn for reversal only.
        int  rev = 0;
        rev = recurse(n,rev);      
        return (int)Math.pow(n,rev);
    }
    static int recurse(int n, int rev){
        if(n==0){
            return rev;
        }              
        int rem = n%10;
        rev = (rev*10)+rem;
        n = n/10;
        return recurse(n,rev);
    }
    
}