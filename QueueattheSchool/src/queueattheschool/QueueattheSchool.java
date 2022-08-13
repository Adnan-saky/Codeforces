package queueattheschool;
import java.util.*;
public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStd = sc.nextInt();
        int t = sc.nextInt();
        String q = sc.next();
        char qq[] = q.toCharArray();
        int len = q.length();       
        char o[] = new char[len];
        for (int i = 0; i < t; i++) {           
            for (int j = 0; j < len; j++) {
                if( j+1 < len && qq[j] == 'B' && qq[j+1] == 'G')
                {
                    qq[j] = 'G';
                    qq[j+1] = 'B';
                    j++;
                }       
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(qq[i]);
        }

    }
    
}
