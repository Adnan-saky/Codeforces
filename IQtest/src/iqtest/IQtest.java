package iqtest;
import java.util.*;
public class IQtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
       
        int x[] = new int [n];
        int c_even = 0, c_odd = 0;
        int evidx = 0, odidx = 0;
        int eidc = 0 , oidc = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            if(x[i]%2 == 0)
            {
                c_even++;
                evidx = i+1;
                eidc++;
            }
            else
            {
                c_odd++;
                odidx = i+1;
                oidc++;
            }  
        }
        if(eidc<oidc)
            System.out.println(evidx);
        else if(oidc < eidc)
            System.out.println(odidx);
    }
    
}
