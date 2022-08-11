package bearandbigbrother;
import java.util.*;
public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int i=0;
        while (true) {            
            i++;
            b1 =(3*b1); 
            b2 =(2*b2);
            if(b1>b2)           
                break;
        }
        System.out.println(i);
    }
}
