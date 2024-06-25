import java.util.Scanner;
public class Lab_3_19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print(fact(i)/(fact(k)*fact(i-k))+" ");
			}
			System.out.println();
		}
	}
	public static int fact(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f *=i;
		}
		return f;
	}
}