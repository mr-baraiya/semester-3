//How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
//program to solve the above problem.

import java.util.Scanner(System.in);

public class DS_LAB_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        Stack stack = new Stack(str.length()); 
        stack.recognize(str);
    }
}
