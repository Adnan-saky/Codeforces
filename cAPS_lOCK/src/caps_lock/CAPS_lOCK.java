package caps_lock;
import java.util.*;
public class CAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String output = "";
        if (s.substring(0, 1).equals(s.substring(0, 1).toLowerCase()) && s.substring(1, s.length()).equals(s.substring(1,s.length()).toUpperCase())) {
            output = s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase();
            System.out.println(output);
        } else if (s.substring(0, 1).equals(s.substring(0, 1).toUpperCase()) && !s.equals(s.toUpperCase())) {
            output = output = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
            System.out.println(output);
        } else if (s.substring(0, 1).equals(s.substring(0, 1).toLowerCase()) && !s.substring(1, s.length()).equals(s.substring(1,s.length()).toUpperCase())) {
            output = s;
            System.out.println(output);
        } else if (s.equals(s.toUpperCase())) {
            output = s.substring(0, 1).toLowerCase() + s.substring(1, s.length()).toLowerCase();
            System.out.println(output);
        }
    }
}
