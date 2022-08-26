
import java.util.Scanner;

public class Evenoddnumber {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Enter Given Number is Even Number");
		}
		else {
			System.out.println("Enter Given Number is odd");
			
		}
	}	

}
