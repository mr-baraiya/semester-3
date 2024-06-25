// Read two 2x2 matrices and perform addition of matrices into third matrix and
// print it
import java.util.*;
public class DS_LAB_30{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        System.out.println("Enter the elemant in matrix A.");
        for(int i=0 ;i<2;i++){
            for(int j=0 ;j<2;j++){
                System.out.println("Enter the number in "+(i+1)+"th row and "+(j+1)+"th column.");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elemant in matrix B.");
        for(int i=0 ;i<2;i++){
            for(int j=0 ;j<2;j++){
                System.out.println("Enter the number in "+(i+1)+"th row and "+(j+1)+"th column.");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of two matrix.");
        int [][] res = new int[2][2];
        for(int i=0 ;i<2;i++){
            for(int j=0 ;j<2;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0 ;i<2;i++){
            for(int j=0 ;j<2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}