
import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		int Number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : :");
		Number = sc.nextInt();
		for (int index = 2; index * index <= Number; index++) {
			while (Number % index == 0) {
				Number = Number / index;
				System.out.print(index + " ");
			}
		}
		if (Number != 1) {
			System.out.print(Number);
		}
	}

}