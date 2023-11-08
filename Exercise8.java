import java.util.Scanner;

public class Exercise8 {

	public Exercise8() {
		// TODO Auto-generated constructor stub
	}

	public static int countDigits(int n) {
		if (n < 10) {
			return 1;
		}
		return countDigits(n / 10) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(98 / 10);
		System.out.println("Please enter n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("The result is: " + countDigits(n));
	}

}
