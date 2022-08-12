package helpful_maths;

import java.util.*;
import java.util.Arrays;

public class Helpful_Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("+", "");
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("+" + arr[i]);
            }
        }

    }

}
