import java.util.Scanner;
public class Lab_8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Not Prime");
		}
		else{
			System.out.println("Is Prime");
		}
	}
}