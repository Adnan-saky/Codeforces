package tram;
import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b,sum = 0,k = 0;
        for (int i = 0; i < (n); i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum = (a + k - b);
            if (sum < 0) {
                k = 0;
            } else {
                k = sum;
            }
        }
        System.out.println(sum);
    }
}
