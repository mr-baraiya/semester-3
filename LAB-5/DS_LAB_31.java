// Read two matrices, first 3x2 and second 2x3, perform multiplication operation
// and store result in third matrix and print it.

import java.util.*;
public class DS_LAB_31{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[3][2];
        int [][] b = new int[2][3];
        System.out.println("Enter the elemant in matrix A.");
        for(int i=0 ;i<3;i++){
            for(int j=0 ;j<2;j++){
                System.out.println("Enter the number in "+(i+1)+"th row and "+(j+1)+"th column.");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elemant in matrix B.");
        for(int i=0 ;i<2;i++){
            for(int j=0 ;j<3;j++){
                System.out.println("Enter the number in "+(i+1)+"th row and "+(j+1)+"th column.");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("A * B Calculated = ");
        int [][] res = new int[3][3];
        for(int i=0 ;i<3;i++){
            for(int j=0 ;j<3;j++){
                int temp = 0;
                for(int k =0 ; k<2 ; k++){
                    temp += a[i][k]*b[k][j];
                }
                res [i][j] = temp;
            }
        }
        System.out.println("A = ");
        for(int i=0 ;i<3;i++){
            for(int j=0 ;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("B = ");
        for(int i=0 ;i<2;i++){
            for(int j=0 ;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("RESULT A * B = ");
        for(int i=0 ;i<3;i++){
            for(int j=0 ;j<3;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}