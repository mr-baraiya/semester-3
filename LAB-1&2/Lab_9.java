import java.util.Scanner;
public class Lab_9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter seconds : ");
		int time = sc.nextInt();
		int hour=time/3600,min=(time-3600*hour)/60,sec=time-hour*3600-min*60;
		System.out.println("Time = "+hour+":"+min+":"+sec);
	}
}