package day3;
public class Overload {
	 public int sum(int a, int b) {
	        return a + b;
	    }
	    public double sum(double a, double b) {
	        return a + b;
	    }
	   public static void main(String[] args) {
	        Overload calculator = new Overload();
	        int intSum = calculator.sum(5, 10);
	        System.out.println("Sum of integers: " + intSum); 
	        double doubleSum = calculator.sum(5.8, 10.5);
	        System.out.println("Sum of doubles: " + doubleSum);
	    }
	} 



