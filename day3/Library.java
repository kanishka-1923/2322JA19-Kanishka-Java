package day3;
public class Library {
	    public static void main(String[] args) {
	        String book1 = "Java Basics";
	        String book2 = "Python Guide";
	        boolean book1Issued = false;
	        boolean book2Issued = false;
	        System.out.println("Books added:");
	        System.out.println(book1);
	        System.out.println(book2);
	               book1Issued = true;
	        System.out.println("Issued: " + book1);
	                book2 = null;
	        System.out.println("Book removed.");
	        System.out.println("Books in library:");

	        if (!book1Issued) System.out.println(book1);
	        else System.out.println(book1 + " (Issued)");
	        if (book2 != null) System.out.println(book2);
	    }
	}
