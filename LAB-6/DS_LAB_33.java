//Write a program to swap two numbers using user-defines method.
import java.util.Scanner;
public class DS_LAB_33 {
    static int num1 = 0;
    static int num2 = 0;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tthe first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter tthe Sacond number : ");
        num2 = sc.nextInt();
        System.out.println("Before : num1 = "+ num1 +" num2 = "+ num2);
        swap();
        System.out.println("After : num1 = "+ num1 +" num2 = "+ num2);
    }
    public static void swap (){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
