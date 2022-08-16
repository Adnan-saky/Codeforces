package translation;
import java.util.*;
public class Translation {
    public static void main(String[] args) {
        
//        String s = "asdf";
//        String out = "";
//        String outm = "";
//        int len = s.length();
//        out = out+ s.charAt(len-1);
//        System.out.println(len);
//        for(int i =0 ; i<len-1;i++)
//        {
//            outm =outm + s.charAt(i);
//        }
//        out = out+outm;
//        System.out.println("\n"+out);
        
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String rev = "";
        char c;
        
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            rev = c+rev;
        }
        
        if(s2.equals(rev))
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
    
}
