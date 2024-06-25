
import java.util.Scanner;

public class Lab_3_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter an element in arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter first number to replace in the array: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number to replace in the array: ");
        int num2 = sc.nextInt();
        sc.close();
        int firstIndex=0, secondIndex=0;
        for(int i=0; i<n; i++) {
            if(arr[i]==num1) {
                arr[i] = num2;
                firstIndex = i;
            }
            else if(arr[i]==num2){
                arr[i] = num1;
                secondIndex = i;
            }
        }
        System.out.println("Index of "+num1+" is "+firstIndex);
        System.out.println("Index of "+num2+" is "+secondIndex);
        System.out.println("Updated array : ");
        for(int i=0; i<n; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
