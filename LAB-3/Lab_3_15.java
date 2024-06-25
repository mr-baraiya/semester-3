//print average of first n numbers
import java.util.Scanner;
public class Lab_3_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Total sum = "+sum);
        double avg = sum/n;
        System.out.println("avg = "+avg);
    }
}