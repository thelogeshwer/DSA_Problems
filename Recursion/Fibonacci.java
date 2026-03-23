package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        // code here
        int a =0;
        int b = 1;
        if(n==0) return a;
        if(n==1) return b;
        int sum = 0;
        int count = 1;
    return recurse(a,b,count,sum,n); //sum =recurse(),i directly return returned value from recurse.
        //return sum
       //this is refractor the code
       //refractor - the process of restructuring or improving existing code without
       // changing its external behavior or functionality.
    
    }
    
    static int recurse(int a,int b,int count,int sum ,int n){
        if(count == n){
            return sum;
        }
       
        
        sum = a+b;
        count ++;
        a=b;
        b=sum;
        return recurse(a,b,count,sum,n);
        //return sum;
        
        
        
    }
    
}

// //int sum = 0;
// int count = 1;
// recurse(a,b,count,sum,n);
// return sum;
// Here’s the catch:

// Java is pass-by-value, even for primitives like int.

// When you call recurse(a,b,count,sum,n), the method gets copies of those primitive values.

// So inside recurse(), the sum that you modify is not the same variable as the sum in fibonacci().

// Thus, the outer sum variable remains unchanged when recursion finishes — it’s still 0.


