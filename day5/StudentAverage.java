package day5;
	import java.util.*;
	public class StudentAverage {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<String> students = new ArrayList<>();
	        HashMap<String, ArrayList<String>> courseMap = new HashMap<>();
	        while (true) {
	            System.out.println("\n--- Student Course Enrollment ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Enroll Course");
	            System.out.println("4. Display Students and Courses");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); 
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    String student = sc.nextLine();
	                    students.add(student);
	                    courseMap.put(student, new ArrayList<>());
	                    System.out.println("Student added.");
	                    break;
	                case 2:
	                    System.out.print("Enter student name to remove: ");
	                    String removeName = sc.nextLine();
	                    students.remove(removeName);
	                    courseMap.remove(removeName);
	                    System.out.println("Student removed.");
	                    break;
	                case 3:
	                    System.out.print("Enter student name: ");
	                    String sName = sc.nextLine();
	                    if (courseMap.containsKey(sName)) {

	                        System.out.print("Enter course name: ");
	                        String course = sc.nextLine();
	                        courseMap.get(sName).add(course);
	                        System.out.println("Course enrolled.");

	                    } else {

	                        System.out.println("Student not found.");
	                    }

	                    break;
	                case 4:
	                    System.out.println("\n--- Student List ---");
	                    Iterator<String> it = students.iterator();
	                    while (it.hasNext()) {
	                        String s = it.next();
	                        System.out.println("Student: " + s);

	                        ArrayList<String> courses = courseMap.get(s);

	                        if (courses.isEmpty()) {
	                            System.out.println("  No courses enrolled.");

	                        } else {
	                            for (String c : courses) {
	                                System.out.println("  - " + c);
	                            }
	                        }
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting...");

	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}
