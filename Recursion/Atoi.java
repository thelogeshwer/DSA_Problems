package Recursion;

public class Atoi {
   public static void main(String[] args) {
        String s = "21474836460";
        //System.out.println(atoi(s) );
       // System.out.println(whileMethod(s));
       System.out.println(myAtoi(s));
    }

    private static int atoi(String s) {
        //this code is works in for loop but , you will learn where to use for loop and while loop.\
        //if first and last index is immutable, use for loop{in this type of code avoid using like this}
        // first and last index is mutable, use while loop.
    s=s.trim();
    int n = s.length();
    long ans = 0;
    
    if(s==null) return 0;
    int MAX = Integer.MAX_VALUE;
    int MIN = Integer.MIN_VALUE;

    int sign = (s.charAt(0)=='-') ? -1:1;
    int i = 0;
    if(sign==-1){ i =1;}
    boolean hasDigits = false;  
          
       for(; i<n ; i++){
         if (!Character.isDigit(s.charAt(i))) break; // stop on non-digit
            hasDigits = true;

        // if(s.charAt(i)=='0' && ans == 0){// this will ignore zero at leading input only due to ans =0
        //     continue;         
        // }
        
          ans = ans * 10 + s.charAt(i) - '0';  
            if (sign == 1 && ans > MAX) return MAX;
            if (sign == -1 && -ans < MIN) return MIN;
       }
        if (!hasDigits) return 0;
       return (int)ans*sign;
    } 


    //using while method, konjam simplest.

    public static int whileMethod(String s){
        s=s.trim();
        int n =s.length();
        int sign = 1;
        int i = 0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i=1;
        }

        long ans = 0;
        int Min = Integer.MIN_VALUE;
        int Max = Integer.MAX_VALUE;
        while(i<n){
            if(!Character.isDigit(s.charAt(i))) break;
            ans = ans*10 + (s.charAt(i)-'0');
            if(sign==-1 && -1*ans<Min) return Min;
            if(sign==1 && ans>Max) return Max;
            i++;
        }
        return (int)ans*sign;// (int)ans*sign ans is long covert to int. but (int)(sign*ans)
       
    }


    //using recursion method
    public static int myAtoi(String s) {
      s=s.trim();
        int n =s.length();
        int sign = 1;
        int i = 0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i=1;
        }

        long ans = 0;
                    
        long result =recurse(i,n,ans,s,sign);
        if(result==Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)result*sign;
    
    } 

     static long  recurse(int i, int n, long ans,String s,int sign){
        if(i>=n){
            return ans;
        }
        if(!Character.isDigit(s.charAt(i))) return ans;
        ans = ans*10 + (s.charAt(i)-'0');
        if(sign==-1 && -1*ans < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(sign==1 && ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return recurse(i+1,n,ans,s,sign);
    }
}
