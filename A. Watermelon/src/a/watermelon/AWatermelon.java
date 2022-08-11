package a.watermelon;
import java.util.Scanner;
public class AWatermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0 && x>2)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");        
    }   
}
