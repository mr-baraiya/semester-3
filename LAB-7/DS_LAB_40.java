/*Write a program to determine if an input character string is of the form aibi
where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’*/

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


public class DS_LAB_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next().toLowerCase();
        if(str.length() %2 == 1) {
            System.out.println("Invalid String");
            return;
        }
        Stack stack = new Stack(str.length());
        for(int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int index = 1;
        while(index<=str.length()) {
            char ch = stack.pop();
            if(index <= str.length()/2) {
                if(ch != 'b') {
                    System.out.println("Invalid String");
                    return;
                }
            }
            else {
                if(ch!='a') {
                    System.out.println("Invalid String");
                    return;
                }
            }
            index++;
        }
        System.out.println("Valid String");
        sc.close();
    }
}