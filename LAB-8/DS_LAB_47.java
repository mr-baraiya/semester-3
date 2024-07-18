//Write a program for evaluation of postfix Expression using Stack.
import java.util.Scanner;
class Stack {
    int TOP = -1;
    int SIZE = 0;
    int[] stack;
    
    public Stack(int SIZE) {
        this.SIZE = SIZE;
        stack = new int[SIZE];
    }

    public void PUSH(int data) {
        if(TOP >= SIZE-1) {
            System.out.println("Stack Overflow");
            return;
        }
        TOP++;
        stack[TOP] = data;
    }

    public int POP() {
        if(TOP<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        TOP--;
        return stack[TOP+1];
    }

    public int PEEK() {
        if(TOP<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return stack[TOP];
    }
    public void DISPLAY(){
        if(TOP == -1){
            System.out.println("Stack is empty");
        }
        for(int i=0; i<=TOP; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
public class DS_LAB_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Postfix String: ");
        String postfix = sc.next();
        int res = evalPostfix(postfix);
        System.out.println("Result: " + res);
    }

    public static int evalPostfix(String postfix){
        Stack s = new Stack(postfix.length());
        for(int i=0; i<postfix.length(); i++) {
            char temp = postfix.charAt(i);
            if(Character.isDigit(temp)){
                int digit = Integer.parseInt(String.valueOf(temp));
                s.PUSH(digit);
            }else if(temp == ','){
                //just ignore
            }
            else{
                int op2 = s.POP();
                int op1 = s.POP();
                switch(temp){
                    case '+':
                    s.PUSH(op1+op2);
                    break;
                    case '-':
                    s.PUSH(op1-op2);
                    break;
                    case '*':
                    s.PUSH(op1*op2);
                    break;
                    case '/':
                    s.PUSH(op1/op2);
                    break;
                    case '^':
                    s.PUSH((int)Math.pow(op1, op2));
                    break;
                    default:
                    System.out.println("Invalid Input At :"+i);
                    break;
                }
            }
        }
        return s.POP();
    }
}
