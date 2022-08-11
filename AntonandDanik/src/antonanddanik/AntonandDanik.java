/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antonanddanik;
import java.util.*;
/**
 *
 * @author adnan
 */
public class AntonandDanik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0,d =0;
        for(int i=0;i<n ;i++)
        {
            if(s.charAt(i) == 'A')
            {
                a++;
            }
            else if(s.charAt(i) == 'D')
            {
                d++;
            }
                
        }
        if(a==d)
            System.out.println("Friendship");
        else if(a>d)
            System.out.println("Anton");
        else
            System.out.println("Danik");
    }
    
}
