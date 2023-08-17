package com.level_2;

import java.util.Scanner;

public class VowelConsonantCounter {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

	        int vowelCount = 0;
	        int consonantCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c >= 'a' && c <= 'z') { // Check if it's an alphabet character
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);

	        scanner.close();
	    }
}
