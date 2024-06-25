import java.util.Scanner;
public class Lab_11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum += i*(i+1)/2;
		}
		System.out.println("Sum = "+sum);
	}
}