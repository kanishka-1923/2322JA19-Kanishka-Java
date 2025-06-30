package day4;
	import java.io.*; 
	import java.util.*; 
	public class ResultFile  
	{ 
	            public static void main(String[] args) { 
	                String inputFile = "C:\\Users\\nivit\\OneDrive\\Documents\\File3.txt"; 
	                String outputFile = "C:\\Users\\nivit\\OneDrive\\Documents\\File4.txt"; 

	                try { 
	                    List<Integer> marks = readMarksFromFile(inputFile); 
	                    double average = calculateAverage(marks); 
	                    writeResultToFile(outputFile, average); 
	                    System.out.println("Calculation completed. Results written to " + outputFile); 

	                } catch (IOException e) { 
	                    System.err.println("An error occurred: " + e.getMessage()); 
	                } 
	            } 
	            public static List<Integer> readMarksFromFile(String filename) throws IOException { 
	                List<Integer> marks = new ArrayList<>(); 
	                try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { 
	                    String line; 
	                    while ((line = reader.readLine()) != null) { 
	                        try { 
	                            int mark = Integer.parseInt(line.trim()); 
	                            marks.add(mark); 
	                        } catch (NumberFormatException e) { 
	                            System.err.println("Invalid mark format: " + line); 
	                        } 
	                    } 
	                } 
	                return marks; 
	            } 

	            public static double calculateAverage(List<Integer> marks) { 
	                if (marks.isEmpty()) { 
	                    return 0.0; 
	                } 
	                int sum = 0; 
	                for (int mark : marks) { 
	                    sum += mark; 
	                } 
	                return sum; 
	            } 

	            public static void writeResultToFile(String filename, double average) throws IOException { 
	                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) { 
	                    writer.write(" total mark: " + average); 
	                } 
	            } 
	        } 


