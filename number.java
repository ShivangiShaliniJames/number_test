/**
 * 
 */
package numberpkg;

import java.util.Scanner;

/**
 * 
 */
public class number {

	public class NumberTesting {

	    // Method to check if a number is even
	    public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }

	    // Method to check if a number is odd
	    public static boolean isOdd(int number) {
	        return number % 2 != 0;
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Method to check if a number is a palindrome
	    public static boolean isPalindrome(int number) {
	        int original = number;
	        int reverse = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number /= 10;
	        }

	        return original == reverse;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number to test:");
	        int number = scanner.nextInt();

	        System.out.println("Results for the number " + number + ":");
	        if (isEven(number)) {
	            System.out.println("- It is even.");
	        } else {
	            System.out.println("- It is odd.");
	        }

	        if (isPrime(number)) {
	            System.out.println("- It is a prime number.");
	        } else {
	            System.out.println("- It is not a prime number.");
	        }

	        if (isPalindrome(number)) {
	            System.out.println("- It is a palindrome.");
	        } else {
	            System.out.println("- It is not a palindrome.");
	        }

	        scanner.close();
	    }
	}
}
