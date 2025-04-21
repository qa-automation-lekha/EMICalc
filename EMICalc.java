package day3assignments;
import java.util.Scanner;
public class EMICalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double principal = scanner.nextDouble();
		System.out.println("Enter the interest rate: ");
		double interest = scanner.nextDouble();
		interest = (interest / (12 * 100));
		System.out.println("Enter the number of years: ");
		int years = scanner.nextInt();
		int months = years * 12;
		double EMI;
		EMI = (principal * interest * (Math.pow(1 + interest,months) / (Math.pow(1 + interest,months) - 1)));
		System.out.println("Your monthly payment is: "+EMI);

	}

}
