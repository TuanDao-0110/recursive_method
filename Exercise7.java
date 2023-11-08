import java.util.Scanner;

public class Exercise7 {

	public Exercise7() {
		// TODO Auto-generated constructor stub
	}

	public static double sum(double n) {
		if (n == 1) {
			return 1;
		}
		return sum(n - 1) + n;
	}

	public static double calculate(double n) {
		if (n == 1) {
			return 1;
		}
		return calculate(n - 1) + (1 / sum(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number n: ");
		double n = Double.parseDouble(scan.nextLine());
		System.out.println("The result is: " + calculate(n));
	}

}
