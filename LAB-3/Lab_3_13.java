//display n number using java
import java.util.Scanner;
public class Lab_3_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Display an array : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}