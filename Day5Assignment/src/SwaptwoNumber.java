import java.util.Scanner;

public class SwaptwoNumber {
	public static void main(String[] args) {
		int a, b, temp;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Number");

		a = n.nextInt();
		System.out.println("Enter Second Number");
		b = n.nextInt();
		System.out.println("\n Before a :" + a + " b :" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("\n after a :" + a + " b =" + b);

	}

}
