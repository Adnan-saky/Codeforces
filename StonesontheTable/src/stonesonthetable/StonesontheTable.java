package stonesonthetable;
import java.util.*;
public class StonesontheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s[] = new char[n];
        s = sc.next().toCharArray();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if ((i+1)<n &&s[i] == s[i + 1]) {
                c++;
            }
        }
        System.out.println(c);
    }
}
