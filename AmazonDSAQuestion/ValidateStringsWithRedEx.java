package AmazonDSAQuestion;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateStringsWithRedEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextLine();
        }

        String regex = "^(a)(.*\\1)?$|^(b)(.*\\3)?$";
        Pattern pattern = Pattern.compile(regex);


        for (String string : arr) {

        Boolean matches = pattern.matcher(string).matches();

        System.out.println(matches ? "true" : "false");
            
            
        }
            
      
            
            
        }

}












