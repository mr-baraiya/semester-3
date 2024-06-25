//print sum between n and m numbers
import java.util.Scanner;
public class Lab_3_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int m = sc.nextInt();
        System.out.println("Enter the sacond number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=m;i<=n;i++){
            sum+=i;
        }
        System.out.println("Total sum = "+sum);
    }
}