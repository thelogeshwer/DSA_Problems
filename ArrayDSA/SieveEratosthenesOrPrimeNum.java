package ArrayDSA;

import java.util.Arrays;

public class SieveEratosthenesOrPrimeNum {
    public static void main(String[] args) {
        int num = 15;
        blackBox(num);
        
        
    }

    public static void blackBox(int num){
        int[] prime = new int[num+1];
        for(int i =2; i<=num; i++){
            prime[i]=1;
        }

        for(int i = 2; i<=(int)Math.sqrt(num); i++){
            if(prime[i]==1){
                for (int j = i*i; j <= num; j=j+i) {
                prime[j]=0;
                }
            }
            
        }
        for (int i = 2; i <= num; i++) {
            if(prime[i]==1) {
                System.out.print(i+" ");
            }
            
        }
        System.out.println();

        int sum = 0;
        for(int i=2; i<=num; i++){
            if(prime[i]==1){
                if(sum+i<num){
                    sum=sum+i;    
                }
                else break;    
            }
        }
        System.out.println(sum);
    }
        
}
