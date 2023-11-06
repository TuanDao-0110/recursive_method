import java.util.Scanner;

public class Exercise1{
    public Exercise1 (){
    }
    // Sum up 
    public static double sum(double n) {
        if ( n==1) {
            return (1/(n+1));
        }
        return sum(n-1) + n / (n +1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input n ");
        double n = Double.parseDouble(scan.nextLine());
        System.out.println(sum(n));
    }
}