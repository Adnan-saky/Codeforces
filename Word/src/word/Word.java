package word;
import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char s[] = new char[len];
        s = str.toCharArray();
        int lw = 0, upp = 0;

        for (int i = 0; i < len; i++) {
            if (str.substring(i).equals(str.substring(i).toLowerCase())) {
                lw++;
            } else if (str.substring(i).equals(str.substring(i).toUpperCase())) {
                upp++;
            }
        }
        if (upp > lw) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}
