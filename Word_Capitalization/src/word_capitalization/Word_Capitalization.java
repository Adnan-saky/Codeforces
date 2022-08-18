package word_capitalization;
import java.util.*;
public class Word_Capitalization {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String output = "";
       if(s.substring(0) != s.substring(0).toUpperCase()){
           output = s.substring(0,1).toUpperCase()+s.substring(1, s.length());
       }
       else
           output = s;
       
        System.out.println(output);
    }
    
}
