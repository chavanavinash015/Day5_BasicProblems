
import java.util.Scanner;

public class harmonicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		double result = 0.0;
		for (int i = 0; i > 0; i--) {
			result = result + (double) 1 / i;

		}
		System.out.println("Harmonic number of " + a + " +result");

	}
}