/*How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
program to solve the above problem. */
import java.util.Scanner;

class Stack {
    int top = -1;
    int size = 0;
    char[] stack;
    
    public Stack(int size) {
        this.size = size;
        stack = new char[size];
    }

    public void push(char ch) {
        if(top >= size-1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = ch;
    }

    public char pop() {
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        top--;
        return stack[top+1];
    }
}

public class DS_LAB_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next().toLowerCase();
        if(str.length() % 2 == 0) {
            System.out.println("Invalid String");
            return;
        }
        int temp = str.length()/2;
        if(str.charAt(temp) != 'c') {
            System.out.println("Invalid String");
            return;
        }
        int len = str.length()/2;
        Stack stack = new Stack(len);
        int index = 0;
        while(index < len) {
            stack.push(str.charAt(index));
            index++;
        }
        index++;//for include index of c
        
        while(index < str.length()) {
            char ch = stack.pop();
            if(str.charAt(index) != ch) {
                System.out.println("Invalid String");
                return;
            }
            index++;
        }
        System.out.println("Valid String");
        sc.close();
    }
}