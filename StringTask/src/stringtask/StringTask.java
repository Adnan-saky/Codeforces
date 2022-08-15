package stringtask;
import java.util.*;
public class StringTask {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine().toLowerCase();
       String dot = ".";
       s = s.replaceAll("[aeiouy]", "");
       s = s.replaceAll("\\B", "." ); 
       s = dot.concat(s);
       System.out.println(s);        
    }
}
