import java.util.Scanner;

public class Stack {
    Scanner sc = new Scanner(System.in);
    int TOP = -1 , MAX = 0;

    int [] stack;

    public Stack(int MAX){
        this.MAX = MAX;
        stack = new int[MAX];
    }

    //DISPLAY method Emplmantions

    public void DISPLAY(){
        System.out.println();
        for(int i = TOP ; i > -1 ; i--){
            System.out.println(stack[i]);
        }
        System.out.println();
        return;
    }

    //PUSH method Emplmantions
    
    public void PUSH (int x){
        if(TOP >= stack.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        TOP++;
        stack[TOP] = x;
        return;
    }

    //POP method Emplmantions

    public int POP(){
        if(TOP == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        TOP--;
        return (stack[TOP+1]);
    }

    //PEEP method Emplmantions

    public int PEEP (int index){
        if((TOP-index+1)<= -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return (stack[TOP-index+1]);
    }

    //Change method Emplmantions

    public void CHANGE(int x , int index){
        if((TOP-index+1)<= -1){
            System.out.println("Stack Underflow");
            return;
        }
        stack[TOP-index+1] = x;   
        return;
    }
}
