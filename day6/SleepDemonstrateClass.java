package day6;

public class SleepDemonstrateClass {
		
	            public static void main(String[] args) throws InterruptedException  
	{ 
	                Thread thread1 = new Thread(() ->                          

	                { 
	                    try { 
	                        System.out.println("Thread 1: Starting..."); 
	                        Thread.sleep(2000); 
	                        System.out.println("Thread 1: Finished sleeping."); 
	                    } catch (InterruptedException e)  
	                   { 
	                        e.printStackTrace(); 
	                    } 
	                }); 

	                thread1.start(); 

	                System.out.println("Main thread: Waiting for thread1..."); 
	                thread1.join();  
	                System.out.println("Main thread: Thread1 finished.  Continuing..."); 

	                System.out.println("Main thread: Work complete."); 
	            } 
	        } 


