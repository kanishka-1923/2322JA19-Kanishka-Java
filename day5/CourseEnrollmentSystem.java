package day5;

import java.util.*; 

public class CourseEnrollmentSystem { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        ArrayList<String> students = new ArrayList<>(); 
        HashMap<String, ArrayList<String>> courses = new HashMap<>(); 

        while (true) { 
            System.out.println("1. Add Student"); 
            System.out.println("2. Enroll Course"); 
            System.out.println("3. Remove Student"); 
            System.out.println("4. Show All"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            int choice = sc.nextInt(); 
            sc.nextLine(); // consume newline 

            if (choice == 1)  
            { 
                System.out.print("Enter student name: "); 
                String name = sc.nextLine(); 
                students.add(name); 
                courses.put(name, new ArrayList<>()); 
                System.out.println("Student added."); 
            }  
            else if (choice == 2) { 
                System.out.print("Enter student name: "); 
                String name = sc.nextLine(); 
                if (courses.containsKey(name)) { 
                    System.out.print("Enter course name: "); 
                    String course = sc.nextLine(); 
                    courses.get(name).add(course); 
                    System.out.println("Course added."); 
                } else { 
                    System.out.println("Student not found."); 
                } 
            }  
            else if (choice == 3) { 
                System.out.print("Enter student name to remove: "); 
                String name = sc.nextLine(); 
                students.remove(name); 
                courses.remove(name); 
                System.out.println("Student removed."); 
            }  
            else if (choice == 4) { 
                System.out.println("\n--- Students and Courses ---"); 
                for (String name : students) { 
                    System.out.println(name + " => " + courses.get(name)); 
                } 
            }  
            else if (choice == 5) { 
                System.out.println("Goodbye!"); 
                break; 
            }  
            else { 
                System.out.println("Invalid choice!"); 
            } 
        } 
    } 
} 


