package day4;

	import java.util.*; 
	import java.io.*; 

	public class WriteClass  
	{ 

	            public static void main(String[] args) 
	            { 
	                List<String> lines = new ArrayList<>(); 
	                lines.add("First line"); 
	                lines.add("Second line"); 
	                lines.add("Third line"); 

	                String filePath = "C:\\Users\\nivit\\OneDrive\\Documents\\Output.txt"; 

	                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) { 
	                    int i = 0; 
	                    while (i < lines.size()) { 
	                        writer.write(lines.get(i)); 
	                        writer.newLine(); 
	                        i++; 
	                    } 
	                } catch (IOException e) { 
	                    System.err.println("Error writing to file: " + e.getMessage()); 
	                } 
	            } 
	        } 


