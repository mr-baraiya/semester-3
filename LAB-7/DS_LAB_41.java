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

public class DS_LAB_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter a string: ");
            String str = scanner.next();
            if(str.length()%2 == 1) {
                System.out.println(0);
            }
            else {
                Stack stack = new Stack(str.length());
                boolean flag = true;
                for(int j=0; j<str.length(); j++) {
                    if(str.charAt(j) == '(') {
                        stack.push(')');
                    }
                    else if(str.charAt(j) == '{') {
                        stack.push('}');
                    }
                    else if(str.charAt(j) == '[') {
                        stack.push(']');
                    }
                    else {
                        if(stack.pop() != str.charAt(j)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
        }
        sc.close();
        scanner.close();
    }
}