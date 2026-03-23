package ArrayDSA;



public class ValidParanthesisString { 
    public static void main(String[] args) {

  
    String s = "())";

    System.out.println(minAddToMakeValid(s));


        
    }

    public static int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else if(s.charAt(i)==')'){
                if(open>0){
                    open--;
                }
                else close ++;
            }

        }
        return open+close;



        
    }




}
