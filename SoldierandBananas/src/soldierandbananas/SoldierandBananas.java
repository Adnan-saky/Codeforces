package soldierandbananas;
import java.util.*;
public class SoldierandBananas {
    static long price(long k, long w) {
        int pr = 0;
        for (int i = 1; i <= w; i++) {
            pr += k*i;
        }        
        return pr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();
        long br = price(k,w)-n;
        if(br>0)
            System.out.println(br);
        else
            System.out.println("0");
    }
}