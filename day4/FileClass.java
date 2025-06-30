package day4;

    import java.io.BufferedReader; 
    import java.io.FileReader; 
    import java.io.IOException; 

    public class FileClass { 
        public static void main(String[] args) { 
            String fileName = "C:\\Users\\kanit\\OneDrive\\Documents\\File1.txt"; // Replace with your file path 
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { 
                String line; 
                while ((line = br.readLine()) != null) { 
                    System.out.println(line); 
                } 
            } catch (IOException e) { 
                System.err.println("Error reading file: " + e.getMessage()); 
            } 
        } 
    } 

