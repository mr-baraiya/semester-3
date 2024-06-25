
import java.util.Scanner;

public class Lab_3_17 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter an element in arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean flag = false;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]==arr[j]) {
                    flag = true;
                    break;
                }
            }
        }
        if(flag) System.out.println("Duplicate elements are present in the array.");
        else System.out.println("Duplicate elements are not present in the array.");
    }
}
