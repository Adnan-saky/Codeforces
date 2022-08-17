
package way.too.pkglong.words;

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []x = new String[n+1];
        for(int i=0 ; i<=n ;i++ )
        {
            x[i] = sc.nextLine();
        }
        for(int i=0 ; i<=n;i++){
            
            if(x[i].length()>10)
            {
                System.out.println(x[i].charAt(0)+""+(x[i].length()-2)+""+x[i].charAt(x[i].length()-1));
            }
            else
                System.out.println(x[i]);
            
        }
        
    }
    
}
