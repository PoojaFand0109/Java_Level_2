package com.level_2;

public class ChracterOccurrences {

	 public static void main(String[] args) {
	        String inputString = "Hello, world!";
	        char targetChar = 'l';
	        
	        int count = countOccurrences(inputString, targetChar);
	        
	        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
	    }
	    
	    public static int countOccurrences(String str, char target) {
	        int count = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == target) {
	                count++;
	            }
	        }
	        
	        return count;
	    }
}
