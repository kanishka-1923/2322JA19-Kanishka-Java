package day5;


	import java.util.HashSet;
	import java.util.Set;

	public class Uniqueaddress {
	    public static void main(String[] args) {
	        	        Set<String> emailSet = new HashSet<>();

	        // Add some email addresses, including duplicates
	        emailSet.add("test@example.com");
	        emailSet.add("another@example.com");
	        emailSet.add("test@example.com"); // Duplicate
	        emailSet.add("third@example.com");
	        emailSet.add("another@example.com"); // Duplicate

	       
	        System.out.println("Number of unique email addresses: " + emailSet.size());	        System.out.println("Unique email addresses:");
	        for (String email : emailSet) {
	            System.out.println(email);
	        }
	    }
	


	}


