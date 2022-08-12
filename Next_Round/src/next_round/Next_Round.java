package next_round;

import java.util.*;
public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int participant = sc.nextInt();
        int kthplace = sc.nextInt();
        int count = 0;
        int secround = 0;
        int[] allplace = new int[participant];
        
        for (int i = 0; i < participant; i++) {
            allplace[i] = sc.nextInt();
        }
        for (int i = 0; i < participant; i++) {
           if(allplace[i]>=allplace[kthplace-1]&&allplace[i]>0){
               count++;
           }
        }
        System.out.println(count);
    }
}
