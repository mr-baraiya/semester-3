import java.util.Scanner;
public class DS_LAB_27{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String res = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
				res += (s.charAt(i)+"").toLowerCase();
			}
			else if(s.charAt(i)<='z' && s.charAt(i)>='a'){
				res += (s.charAt(i)+"").toUpperCase();
			}
			else{
				res += s.charAt(i)+"";
			}
		}
		System.out.println("Required String = "+res);
	}
}