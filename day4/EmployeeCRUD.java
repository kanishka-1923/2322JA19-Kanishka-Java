package day4;
	import java.io.*;
	import java.util.*;
	public class EmployeeCRUD {
	    static final String FILE_NAME = "employees.txt";
	    public static void add(String id, String name) throws IOException {
	        FileWriter fw = new FileWriter(FILE_NAME, true);
	        fw.write(id + "," + name + "\n");
	        fw.close();
	        System.out.println("Employee added.");
	    }
	    public static void view() throws IOException {
	        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
	        String line;
	        System.out.println("Employee List:");
	        while ((line = br.readLine()) != null) {
	            String[] data = line.split(",");
	            System.out.println("ID: " + data[0] + ", Name: " + data[1]);
	        }
	        br.close();
	    }
	    public static void update(String id, String newName) throws IOException {
	        File input = new File(FILE_NAME);
	        File temp = new File("temp.txt");

	        BufferedReader br = new BufferedReader(new FileReader(input));
	        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
	        String line;
	        boolean found = false;

	        while ((line = br.readLine()) != null) {
	            String[] data = line.split(",");
	            if (data[0].equals(id)) {
	                bw.write(id + "," + newName + "\n");
	                found = true;
	            } else {
	                bw.write(line + "\n");
	            }
	        }

	        br.close();
	        bw.close();

	        input.delete();
	        temp.renameTo(input);

	        if (found) System.out.println("Employee updated.");
	        else System.out.println("ID not found.");
	    }
	    public static void delete(String id) throws IOException {
	        File input = new File(FILE_NAME);
	        File temp = new File("temp.txt");

	        BufferedReader br = new BufferedReader(new FileReader(input));
	        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
	        String line;
	        boolean found = false;

	        while ((line = br.readLine()) != null) {
	            String[] data = line.split(",");
	            if (!data[0].equals(id)) {
	                bw.write(line + "\n");
	            } else {
	                found = true;
	            }
	        }

	        br.close();
	        bw.close();

	        input.delete();
	        temp.renameTo(input);

	        if (found) System.out.println("Employee deleted.");
	        else System.out.println("ID not found.");
	    }
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            if (ch == 1) {
	                System.out.print("Enter ID: ");
	                String id = sc.nextLine();
	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();
	                add(id, name);
	            } else if (ch == 2) {
	                view();
	            } else if (ch == 3) {
	                System.out.print("Enter ID to update: ");
	                String id = sc.nextLine();
	                System.out.print("Enter new name: ");
	                String name = sc.nextLine();
	                update(id, name);
	            } else if (ch == 4) {
	                System.out.print("Enter ID to delete: ");
	                String id = sc.nextLine();
	                delete(id);
	            } else if (ch == 5) {
	                break;
	            } else {
	                System.out.println("Invalid choice!");
	            }
	        }
	        sc.close();
	    }
	}



