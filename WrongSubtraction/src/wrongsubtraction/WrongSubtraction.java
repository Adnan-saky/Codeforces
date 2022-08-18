package wrongsubtraction;
import java.util.*;
public class WrongSubtraction {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       long n = sc.nextLong();
       int k = sc.nextInt();
       
       if( n == 0 || k ==0)
       {
           System.out.println(n);
           return;
       }
        for (int i = 1; i <=k; i++) {
            if(n%10 == 0)
            {
                n=n/10;
            }
            else
                n--;
        }
        
        System.out.println(n);
       
    }
    
}
