import java.util.Scanner;
public class Lab_3_20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		String[] names = new String[n];
		for(int i=0;i<names.length;i++){
			System.out.print("Enter name "+i+" : ");
			names[i] = sc.next();
		}
		String temp="";
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(names[i].compareTo(names[j]) > 0){
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("After sorting\n");
		for(int i=0;i<n;i++){
			System.out.println("Name "+i+" : "+names[i]);
		}
	}
}