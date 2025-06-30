package day3;

public class Person {
	    String name;
	}
	class Employee extends Person {
	    double salary;
	    void calculateSalary() {
	        salary = 50000;  // fixed salary
	        System.out.println("Name: " + name);

	        System.out.println("Salary: " + salary);
	    }
	}
	public class Employee {
	    public static void main(String[] args) {
	        Employee e = new Employee();
	        e.name = "John";
	        e.calculateSalary();
	    }
	}

