package day4;
	import java.util.Scanner;
	public class DivideByZero {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter numerator: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter denominator: ");
	        int b = scanner.nextInt();
	        try {

	            int result = a / b;

	            System.out.println("Result: " + result);

	        } catch (ArithmeticException e) {

	            System.out.println("Error: Division by zero is not allowed.");
	        }

	        scanner.close();
	    }
	}


