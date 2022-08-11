package beautiful_matrix;
import java.util.*;
public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]mat = new int[5][5];
        int row =0;
        int col = 0;
        int move = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 1)
                {
                    row = i;
                    col = j;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            for (int j = 0; j < 5; j++) {
                if(mat[i][j] == 1)
                {
                    move = move+Math.abs(2-row);
                    move = move+Math.abs(2-col);   
                }
            }
        }
        System.out.println(move);
    }
}
