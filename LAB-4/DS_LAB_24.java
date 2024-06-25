import java.util.Scanner;
public class DS_LAB_24{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int[] prev = new int[n];
		int[] next = new int[n-1];
		for(int i=0;i<n;i++){
			System.out.print("Enter value of  arr["+i+"] : ");
			prev[i] = sc.nextInt();
		}
		System.out.print("Enter number you want to delete : ");
		int num = sc.nextInt();
		int j=0;
		for(int i=0;i<next.length;i++,j++){
			if(prev[i] == num){
				next[i] = prev[i+1];
				j--;
			}
			else{
				next[i] = prev[j];
			}
		}
		System.out.println("After deletion : ");
		for(int i=0;i<next.length;i++){
			System.out.println("Value of arr["+i+"] : "+next[i]);
		}
	}
}