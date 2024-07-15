//Write a program to convert infix notation to prefix notation using stack.
import java.util.Scanner;

class Stack {
    int TOP = -1;
    int SIZE = 0;
    char[] stack;
    
    public Stack(int SIZE) {
        this.SIZE = SIZE;
        stack = new char[SIZE];
    }

    public void PUSH(char ch) {
        if(TOP >= SIZE-1) {
            System.out.println("Stack Overflow");
            return;
        }
        TOP++;
        stack[TOP] = ch;
    }

    public char POP() {
        if(TOP<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        TOP--;
        return stack[TOP+1];
    }

    public char PEEK() {
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
public class DS_LAB_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Infix Expression : ");
        // String exp = sc.next();
        String exp = "(a+b*c/d-e+f/g/(h+i))";
        exp = reverseInfix(exp);
        System.out.println("Reverse exp : "+exp);
        exp = revpol(exp);
        System.out.println("Postfix exp : "+exp);
        String res = reverseInfix(exp);
        System.out.println("Prefix : "+res);
        sc.close();
    }
    public static String reverseInfix(String exp){
        String res = "";
        for(int i=exp.length()-1;i>=0;i--){
            char temp = exp.charAt(i);
            switch(temp){
                case '(':
                res += ')';
                break;
                case ')':
                res += '(';
                break;
                default:
                res += temp;
                break; 
            }
        }
        return res;
    }
    public static String revpol(String exp){
        exp += ')';
        String polish = "";
        int rank = 0 , i = 0;
        Stack stack = new Stack(exp.length());
        stack.PUSH('(');
        char next;
        while(i < exp.length()){ 
            next = exp.charAt(i);
            i++;
            if(stack.TOP < 0){
                System.out.println("INVALID1");
                return " ";
            }
            while(getStackPrecedence(stack.PEEK()) > getInputPrecedence(next)){
                char temp = stack.POP();
                polish += temp;
                rank += getRank(temp);
                if(rank < 1){
                    System.out.println("INVALI2");
                    return " ";
                } 
            }
            if(getStackPrecedence(stack.PEEK()) != getInputPrecedence(next)){
                stack.PUSH(next);
            }else{
                stack.POP();
            }
        }
        if(stack.TOP != -1 || rank != 1){
            System.out.println("INVALID3");
            return " ";
        }
        System.out.println("VALID");
        return polish;
    }
    public static int getInputPrecedence(char temp){
        switch(temp){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 3;
            case '^':
            return 6;
            case '(':
            return 9;
            case ')':
            return 0;
            default :
            return 7;
        }
    }
    public static int getStackPrecedence(char temp){
        switch(temp){
            case '+':
            case '-':
            return 2;
            case '*':
            case '/':
            return 4;
            case '^':
            return 5;
            case '(':
            return 0;
            default : 
            return 8;
        }
    }
    public static int getRank(char temp){
        switch(temp){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            return -1;
            default : 
            return 1;
        }
    }
}
