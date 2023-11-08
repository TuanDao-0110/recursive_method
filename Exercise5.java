import java.util.Scanner;

public class Exercise5 {

	public Exercise5() {
		// TODO Auto-generated constructor stub
	}

	public static double calculate(double n) {
		if (n == 1) {
			return 1 / (n * (n + 1));
		}
		return calculate(n - 1) + (1 / (n * (n + 1)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number n: ");
		double n = Double.parseDouble(scan.nextLine());
		System.out.println("The result is: " + calculate(n));
	}

}
