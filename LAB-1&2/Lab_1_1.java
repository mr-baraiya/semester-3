import java.util.Scanner;
public class Lab_1_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.print("Enter radius of circle : ");
		r = sc.nextDouble();
		System.out.println("Area of Circle = "+Math.PI*r*r+" units");
	}
}