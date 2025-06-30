package day1;
	import java.util.Scanner;
	public class Mainpro{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int choice;
	        double num1, num2, result;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Divide");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();

	            if (choice >= 1 && choice <= 4) {
	                System.out.print("Enter first number: ");
	                num1 = input.nextDouble();
	                System.out.print("Enter second number: ");
	                num2 = input.nextDouble();
	                switch (choice) {
	                    case 1:
	                        result = add(num1, num2);
	                        break;
	                    case 2:
	                        result = subtract(num1, num2);
	                        break;
	                    case 3:
	                        result = multiply(num1, num2);
	                        break;
	                    case 4:
	                        result = divide(num1, num2);
	                        break;
	                    default:
	                        result = 0;
	                }
	                 System.out.println("Result: " + result);
	            } else if (choice != 0) {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 0);

	        System.out.println("Exiting calculator.");
	        input.close();
	    }
	    public static double add(double num1, double num2) {
	        return num1 + num2;
	    }
	    public static double subtract(double num1, double num2) {
	        return num1 - num2;
	    }
	    public static double multiply(double num1, double num2) {
	        return num1 * num2;
	    }
	    public static double divide(double num1, double num2) {
	        if (num2 == 0) {
	            System.out.println("Cannot divide by zero.");
	            return 0;
	        }
	        return num1 / num2;
	    }
	}


