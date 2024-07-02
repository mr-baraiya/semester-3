import java.util.Scanner;
import java.util.Stack;
public class DS_LAB_40{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'a'){
			st.push(s.charAt(i));
			}
			else if(s.charAt(i) == 'b'){
				st.pop();
			}
			else{
				System.out.println("Invalid String");
				return;
			}
		}
		if(st.isEmpty()){
			System.out.println("Valid String");
		}
		else{
			System.out.println("Invalid String");
		}
	}
}