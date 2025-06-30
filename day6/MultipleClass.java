package day6;
	public class MultipleClass  
	{ 
	            public static void main(String[] args) { 
	                MessagePrinter printer1 = new MessagePrinter("Hello from Thread 1"); 
	                MessagePrinter printer2 = new MessagePrinter("Greetings from Thread 2"); 

	                Thread thread1 = new Thread(printer1); 
	                Thread thread2 = new Thread(printer2); 

	                thread1.start(); 
	                thread2.start(); 
	            } 
	        } 

	class MessagePrinter implements Runnable 
	 { 
	    private String message; 

	    public MessagePrinter(String message)  
	{ 
	        this.message = message; 
	    } 

	    @Override 
	    public void run() { 
	        System.out.println("Thread " + Thread.currentThread().getName() + ": " + message); 
	    } 
	} 



