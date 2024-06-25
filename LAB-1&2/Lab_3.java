import java.util.Scanner;
public class Lab_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vow = "aeiouAEIOU";
		String s;
		System.out.print("Enter an alphabet : ");
		s = sc.next();
		if(vow.contains(s)){
			System.out.println("Is a vowel");
		}
		else{
			System.out.println("Is not a vowel");
		}
	}
}