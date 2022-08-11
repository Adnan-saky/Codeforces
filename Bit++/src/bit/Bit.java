package bit;
import java.util.*;
public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String []x = new String[n+1];
        for (int i = 0; i < n; i++) {
            x[i] = sc.next();
        } 
        for(int i=0;i<n;i++)
        {
            if(x[i].equals("X++") || x[i].equals("++X"))
            {
                count++;
            }
            else if(x[i].equals("X--") || x[i].equals("--X"))
            {
                count--;
            }
        }
        System.out.println(count);
    }
}
