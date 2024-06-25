import java.util.Scanner;
public class Lab_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		if(n%2==0){
			System.out.print("Even Number");
		}
		else{
			System.out.print("Odd Number");
		}
	}
}