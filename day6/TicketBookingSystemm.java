package day6;

class TicketBookingSystemm {
		    private int totalSeats; 

	    public TicketBookingSystemm(int seats) { 
	        this.totalSeats = seats; 
	    } 


	    public synchronized void bookTickets(String user, int seatsRequested) { 
	        System.out.println(user + " is trying to book " + seatsRequested + " ticket(s)."); 

	        try { 
	            Thread.sleep(1000); // Simulate delay 
	        } catch (InterruptedException e) { 
	            e.printStackTrace(); 
	        } 

	        if (seatsRequested <= totalSeats) { 
	            System.out.println("Booking successful for " + user + "!"); 
	            totalSeats -= seatsRequested; 
	        } else { 
	            System.out.println("Booking failed for " + user + ",Due to unavailability of seats"); 
	        } 

	        System.out.println("Remaining seats: " + totalSeats + "\n"); 
	    } 
	} 

	class UserThread extends Thread { 
	    private TicketBookingSystemm booking; 
	    private String userName; 
	    private int seatsToBook; 

	    public UserThread(TicketBookingSystemm booking, String userName, int seatsToBook) { 
	        this.booking = booking; 
	        this.userName = userName; 
	        this.seatsToBook = seatsToBook; 
	    } 

	    @Override 
	    public void run() { 
	        booking.bookTickets(userName, seatsToBook); 
	    } 
	} 

	public class TicketBookingSystemm { 
	    public static void main(String[] args) { 
	        TicketBookingSystemm bookingSystem = new TicketBookingSystemm(10);  


	        UserThread user1 = new UserThread(bookingSystem, "Kani",2); 
	        UserThread user2 = new UserThread(bookingSystem, "Dharsna", 2); 
	        UserThread user3 = new UserThread(bookingSystem, "chtuki", 3); 
	        UserThread user4 = new UserThread(bookingSystem, "mowgli", 4); 


	        user1.start(); 
	        user2.start(); 
	        user3.start(); 
	        user4.start(); 
	    } 
	} 

