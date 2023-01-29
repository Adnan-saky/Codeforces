
package petyaandstrings;

import java.util.Scanner;
 
public class PetyaandStrings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int result = word1.compareTo(word2);
        if(result > 0){
            result = 1;
        }else if(result < 0){
            result = -1;
        }
        else
            result =0;
        System.out.println(result);
    }
}