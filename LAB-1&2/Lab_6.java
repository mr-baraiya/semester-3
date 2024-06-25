import java.util.Scanner;
public class Lab_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base : ");
		int b = sc.nextInt();
		System.out.print("Enter power : ");
		int p = sc.nextInt();
		int ans=1;
		for(int i=1;i<=p;i++){
			ans *= b;
		}
		System.out.println("Answer = "+ans);

	}
}