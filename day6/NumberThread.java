package day6;

	public class NumberThread extends Thread { 
	    @Override 
	    public void run() { 
	        for (int i = 1; i <= 10; i++) { 
	            System.out.println(i); 
	        } 
	    } 

	    public static void main(String[] args) { 
	        NumberThread thread = new NumberThread(); 
	        thread.start(); 
	    } 
	} 


