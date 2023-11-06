import java.util.Scanner;

public class Exercise2 {

    public Exercise2() {
        // TODO Auto-generated constructor stub
    }

    public static double squareRootSum(double n) {
        if (n == 1) {
            return Math.sqrt(n);
        }
        return Math.sqrt(n + squareRootSum(n - 1));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        double n = Double.parseDouble(scan.nextLine());
        System.out.println("The result is: " + squareRootSum(n));
    }
}
