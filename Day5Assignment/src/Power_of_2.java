
import java.util.Scanner;

public class Power_of_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power of two : ");
		int Value = sc.nextInt();
		int n = 2;
		int Result = 1;
		for (int index = 1; index <= Value; index++) {
			Result = n * Result;

		}
		System.out.println("Power Of + " + Result);
	}
}
