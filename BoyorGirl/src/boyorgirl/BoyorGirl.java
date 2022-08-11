package boyorgirl;
import java.util.*;
public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int len = name.length();
        int repcnt[]= new int[len];
        int totalrep =0;
        int repno=0;
        
        char s[] = new char [len];
        char rep[] = new char [len];
        
        int count =0;
        s = name.toCharArray();
        for (int i = 0; i < len; i++) {
            count=1;
            for (int j =i+ 1; j < len; j++) {
                if(s[i]==s[j]&& s[i] != ' ')
                {
                    count++; 
                    rep[i] = s[j];
                    repcnt[i] = count;
                    s[j]='\0';
                    
                }
            }
            if(count > 1&& s[i] != '\0')  
            {
               
                totalrep = totalrep+repcnt[i];
                repno++;
            } 
            
            
        }
        
        int needtosub = totalrep-repno;
        int newlen = name.length()-needtosub;
        if(newlen %2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
            System.out.println("IGNORE HIM!");
    }
    
}
