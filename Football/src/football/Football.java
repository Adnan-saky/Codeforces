package football;
import java.util.*;
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char t[] = new char[100];
        int f = 0;
        String sq = sc.nextLine();
        if (sq.length() > 6 && sq.length() <= 100) {
            for (int i = 0; i < sq.length(); i++) {
                if (i + 7 <= sq.length() && (sq.substring(i, i + 7).equals("0000000") || sq.substring(i, i + 7).equals("1111111"))) {
                    System.out.println("YES");
                    f = 1;
                    break;
                }
            }
        }
        if (f == 0) {
            System.out.println("NO");
        }
    }
}
