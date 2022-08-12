package domino_piling;
import java.util.Scanner;
public class Domino_piling {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int areaofDom = 2;     
        int areaofsq = M*N;
        int noOfDom = (int) Math.floor(areaofsq/areaofDom);
        System.out.println(noOfDom);
    } 
}
