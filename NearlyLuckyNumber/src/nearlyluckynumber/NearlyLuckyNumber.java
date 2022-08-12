package nearlyluckynumber;
import java.util.*;
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seven = 0, four = 0;
        long n = sc.nextLong();
        while (true) {
            if (n != 0) {
                if (n % 10 == 4) {
                    n = n / 10;
                    four++;
                } else if (n % 10 == 7) {
                    n = n / 10;
                    seven++;
                } else {
                    n = n / 10;
                }
            } else {
                break;
            }
        }
        if ((four + seven) == 7 || (four + seven) == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
