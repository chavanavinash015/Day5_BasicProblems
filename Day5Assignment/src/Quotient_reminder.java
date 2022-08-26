
import java.util.Scanner;

public class Quotient_reminder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend : ");
		int dividend = sc.nextInt();
		System.out.println("Enter Divisor: ");
		int divisor = sc.nextInt();
		int Quotient = dividend / divisor;
		int Reminder = dividend / divisor;
		System.out.println("Quotient = " + Quotient + " and Reminder = " + Reminder);
	}
}
