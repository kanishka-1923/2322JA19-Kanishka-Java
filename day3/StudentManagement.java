package day3;

	import java.util.*;  
	public class StudentManagement {
	    public static void main(String args[])  
	    {    
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Enter the student name"); 
	        String Name= sc.next(); 
	        int n;      
	        System.out.println("Enter the total subjects "); 
	        n=sc.nextInt(); 
	        int arr[] = new int[n];  
	        System.out.println("Enter the marks secured in each subject "); 
	        for(int i=0;i<n;i++)    
	        { 
	            arr[i]=sc.nextInt(); 
	        } 

	        int total=0; 
	        for(int i=0;i<n;i++) 
	        { 
	            total=total+arr[i]; 
	        } 
	        System.out.println("Student Name:"+Name); 
	        System.out.println("The total marks obtained is "+total); 
	        float percentage;  
	        percentage = (total / (float)n); 
	        System.out.println( "Total Percentage : " + percentage + "%");                          
	    }    
	} 


