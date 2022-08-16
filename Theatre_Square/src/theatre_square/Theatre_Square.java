
package theatre_square;

import java.util.Scanner;
public class Theatre_Square {
    public static void main(String[] args) {
        double  n,m,a;
        long len, width;
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        m = sc.nextDouble();
        a = sc.nextDouble();
        len = (long) Math.ceil(n/a);
        width = (long) Math.ceil(m/a);  
        System.out.println(len*width);    
    }
 
}
