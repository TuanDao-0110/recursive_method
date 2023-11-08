import java.util.Scanner;

public class Exercise4 {

	public Exercise4() {
		// TODO Auto-generated constructor stub
	}

	public static double calculate(double n) {
		if (n == 1) {
			return 1 /(n*2);
		}
		return calculate(n - 1) + (1 / (n*2));
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number n: ");
            double n = Double.parseDouble(scan.nextLine());
            System.out.println("The result is: " + calculate(n));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
