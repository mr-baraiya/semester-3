//Write a program to convert infix notation to postfix notation using stack.
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
public class DS_LAB_45{
    public static void main(String[] args) {
        String exp = "a+b*c-d/e";
        String res = revpol(exp);
        System.out.println(res);
    }

    public static String revpol(String exp){
        exp += ')';
        String postfix = "";
        int rank = 0 , i = 0;
        Stack s = new Stack(exp.length());
        s.PUSH('(');
        char next = exp.charAt(i);
        while(next != ' '){
            if(s.TOP < 1){
                System.out.println("INVALID");
                return null;
            }
            while(getStackPrecedence(s.PEEK()) > getInputPrecedence(next)){
                char temp = s.POP();
                postfix += temp;
                rank += getRank(temp);
                if(rank < 1){
                    System.out.println("INVALID");
                    return null;
                } 
            }
            if(getStackPrecedence(s.PEEK()) != getInputPrecedence(next)){
                s.PUSH(next);
            }else{
                s.POP();
            }
            next = exp.charAt(++i);
        }
        if(s.TOP != 0 || rank != 1){
            System.out.println("INVALID");
        }else{
            System.out.println("VALID");
        }
        return postfix;
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