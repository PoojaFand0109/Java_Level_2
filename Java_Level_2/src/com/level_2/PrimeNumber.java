package com.level_2;

public class PrimeNumber {

	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        
	        if (number <= 3) {
	            return true;
	        }

	        if (number % 2 == 0 || number % 3 == 0) {
	            return false;
	        }

	        for (int i = 5; i * i <= number; i += 6) {
	            if (number % i == 0 || number % (i + 2) == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        int num = 19; 
	        if (isPrime(num)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }
}
