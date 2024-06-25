import java.util.Scanner;
public class DS_LAB_25{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter value of arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		int j=0;
		for(int i=0;i<n-1;i++){
			if(arr[i] != arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		for(int i=0;i<j;i++){
			System.out.println("Value of arr["+i+"] : "+arr[i]);
		}
	}
}