package day2;


import  java.util.Scanner;

	public class StringAnalyzer {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();

	        // Word count
	        String[] words = input.trim().split("\\s+");
	        int wordCount = words.length;

	        // Character count (excluding spaces)
	        int charCount = input.replace(" ", "").length();

	        // Reverse the string
	        String reversed = new StringBuilder(input).reverse().toString();

	        // Find the longest word
	        String longestWord = "";
	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }

	        // Output results
	        System.out.println("Word count: " + wordCount);
	        System.out.println("Character count (excluding spaces): " + charCount);
	        System.out.println("Reversed string: " + reversed);
	        System.out.println("Longest word: " + longestWord);

	        scanner.close();
	    }
	


	}


