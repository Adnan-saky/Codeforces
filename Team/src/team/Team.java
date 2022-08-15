package team;
import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int []solution = new int[3];   
        int solve = 0;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j=0; j<3 ;j++)
            {
                solution[j] = sc.nextInt();
                sum +=solution[j];  
            }
            if(sum>1)
              solve++;          
        }       
            System.out.println(solve);
    }  
}
