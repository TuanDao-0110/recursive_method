import java.util.Scanner;

public class Exercise6 {

	public Exercise6() {
		// TODO Auto-generated constructor stub
	}

	public static long calculate(int x, long n) {
		if (n == 1) {
			return (long) Math.pow(x, n);
		}
		return calculate(x, n - 1) + (long) Math.pow(x, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number x: ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("Enter the number n: ");
		long n = Long.parseLong(scan.nextLine());
		System.out.println("The result is: " + calculate(x, n));
	}
}
