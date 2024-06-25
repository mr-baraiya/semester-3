import java.util.Scanner;
public class Lab_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int res = fact(n);
		System.out.println("Factorial = "+res);

	}
	public static int fact(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}