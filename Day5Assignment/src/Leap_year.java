
import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		System.out.println("Enter which Year Check");
		int Leapyear = 0;

		Scanner sc = new Scanner(System.in);
		Leapyear = sc.nextInt();

		if (Leapyear % 100 == 0 && Leapyear % 400 == 0 || Leapyear % 100 != 0 && Leapyear % 4 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("not Leap Year");
		}
	}
}