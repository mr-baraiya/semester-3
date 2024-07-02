import java.util.Scanner;
import java.util.Stack;

public class DS_LAB_39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        sc.close();
        
        if (isPalindrome(s)) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            stack.push(s.charAt(i));
        }

        int start = (n % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < n; i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
