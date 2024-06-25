import java.util.Scanner;
public class DS_LAB_26{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array 1 : ");
		int m = sc.nextInt();
		System.out.print("Enter size of array 2 : ");
		int n = sc.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		int[] res = new int[m+n];
		for(int i=0;i<m;i++){
			System.out.print("Enter value of arr1["+i+"] : ");
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print("Enter value of arr2["+i+"] : ");
			arr2[i] = sc.nextInt();
		}
		int j=0;
		for(j=0;j<m;j++){
			res[j] = arr1[j];
		}
		for(;j<m+n;j++){
			res[j] = arr2[j-m];
		}
		for(int i=0;i<m+n;i++){
			System.out.print("\nValue of res["+i+"] : "+res[i]);
		}
	}
}