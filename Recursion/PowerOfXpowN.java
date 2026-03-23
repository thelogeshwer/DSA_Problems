package Recursion;

public class PowerOfXpowN {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000,10));
        
    }

    public static double myPow(double x, int n) {
        double  xans = 1.0;

        long nn = n;
        if (nn < 0) {
            nn = -1 * nn;
        }
        xans =recursion(x,nn,xans);
        if(n<0){ xans = 1.0/ (double) xans;}
        return xans;     

    }
    static double  recursion(double x,long nn, double xans){
        if(nn==0){
            return xans;
        }

        if(nn%2 != 0){
            xans = xans * x;
            nn = nn-1;
            return recursion(x, nn,xans);
        }
        else{
            x=x*x;
            nn=nn/2;
            return recursion(x, nn,xans);
        }
    }


    
    ///////////normal O(1) space linear method/////
    
    private static double exponent(double x, int n) {
        long nn = n;
        if(nn<0){nn=-1 * nn;}
        double xans=1.0;
        while(nn>0){
            if(nn%2 != 0){
                xans=x*xans;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2;
            }
        }

        if(n<0){
            xans= 1.0 / (double)xans;
        }

        return xans;

        
    }
}
