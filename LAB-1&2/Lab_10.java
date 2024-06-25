import java.util.Scanner;
public class Lab_10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of days : ");
		int days = sc.nextInt();
		int year=days/365,week=(days - year*365)/7,day=days-year*365-week*7;
		System.out.println(year+" years "+week+" weeks "+day+" days");
	}
}