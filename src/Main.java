import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it!");

        // Start the game
        playGame();
    }
}
public static void playGame() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int low = 1;       // Minimum range
    int high = 100;    // Maximum range
    boolean isCorrect = false; // Flag to check if the guess is correct

    while (!isCorrect) {
        int guess = random.nextInt(high - low + 1) + low; // Generate random guess
        System.out.println("Computer guesses: " + guess);
        System.out.println("Is the guess 'high', 'low', or 'correct'?");

        String feedback = scanner.nextLine().toLowerCase(); // Take user feedback

        if (feedback.equals("correct")) {
            System.out.println("Yay! The computer guessed your number.");
            isCorrect = true; // End the game
        } else if (feedback.equals("high")) {
            high = guess - 1; // Adjust range (guess was too high)
        } else if (feedback.equals("low")) {
            low = guess + 1; // Adjust range (guess was too low)
        } else {
            System.out.println("Please enter valid feedback: 'high', 'low', or 'correct'.");
        }
    }

    scanner.close(); // Close scanner to free resources
}

import java.util.Scanner;
public class MaximumOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers to find the maximum:");

        // Call input function
        int[] numbers = takeInput();

        // Call max function
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        System.out.println("The maximum number is: " + max);
    }
}
public static int[] takeInput() {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[3]; // Array to store 3 inputs

    System.out.print("Enter the first number: ");
    numbers[0] = scanner.nextInt();

    System.out.print("Enter the second number: ");
    numbers[1] = scanner.nextInt();

    System.out.print("Enter the third number: ");
    numbers[2] = scanner.nextInt();

    return numbers; // Return the array
}
public static int findMaximum(int num1, int num2, int num3) {
    int max = num1; // Assume first number is maximum

    if (num2 > max) {
        max = num2; // Update max if second number is greater
    }
    if (num3 > max) {
        max = num3; // Update max if third number is greater
    }

    return max; // Return the maximum value
}


import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt(); // User input

        // Call the function to check if the number is prime
        boolean isPrime = checkPrime(number);

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
public static boolean checkPrime(int number) {
    if (number <= 1) {
        return false; // Numbers less than or equal to 1 are not prime
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false; // If divisible by any number, it's not prime
        }
    }

    return true; // If no divisor found, it's prime
}


import java.util.Scanner;
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt(); // Number of terms input by user

        // Call the function to generate Fibonacci sequence
        generateFibonacci(terms);
    }
}
public static void generateFibonacci(int terms) {
    if (terms <= 0) {
        System.out.println("Please enter a positive number.");
        return;
    }

    int first = 0, second = 1; // Starting numbers of the sequence
    System.out.print("Fibonacci Sequence: ");

    for (int i = 1; i <= terms; i++) {
        System.out.print(first + " "); // Print the current number

        // Calculate the next number
        int next = first + second;
        first = second; // Update first number
        second = next;  // Update second number
    }
    System.out.println(); // For a new line after printing sequence
}

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.nextLine();

        // Step 2: Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);

        // Step 3: Display the result
        displayResult(inputString, isPalindrome);
    }
}
public static boolean checkPalindrome(String str) {
    // Convert the string to lowercase to handle case sensitivity
    str = str.toLowerCase();

    // Use two pointers: one from start and one from end
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Not a palindrome
        }
        start++;
        end--;
    }
    return true; // Is a palindrome
}
public static void displayResult(String str, boolean isPalindrome) {
    if (isPalindrome) {
        System.out.println("The string \"" + str + "\" is a palindrome.");
    } else {
        System.out.println("The string \"" + str + "\" is not a palindrome.");
    }
}


import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Step 2: Calculate factorial using recursion
        long factorial = calculateFactorial(number);

        // Step 3: Display the result
        displayResult(number, factorial);
    }
}
public static long calculateFactorial(int n) {
    if (n == 0 || n == 1) {
        return 1; // Base case: 0! = 1! = 1
    } else {
        return n * calculateFactorial(n - 1); // Recursive call
    }
}
public static void displayResult(int n, long factorial) {
    System.out.println("The factorial of " + n + " is: " + factorial);
}
if (n < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
    return -1;
            }
public static long calculateFactorialIterative(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}


import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Function to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // When b becomes 0, a is the GCD
    }

    // Function to calculate LCM using the formula LCM(a, b) = |a * b| / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;  // Using the formula for LCM
    }

    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD
        int gcd = calculateGCD(num1, num2);

        // Calculate LCM using GCD
        int lcm = calculateLCM(num1, num2, gcd);

        // Displaying the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}

import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);  // Applying the formula to convert
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;  // Applying the formula to convert
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to choose the conversion type
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        double result;  // Variable to store the result of conversion

        if (choice == 1) {
            // Fahrenheit to Celsius conversion
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            result = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius: " + result);
        } else if (choice == 2) {
            // Celsius to Fahrenheit conversion
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            result = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();  // Closing the scanner object
    }
}

import java.util.Scanner;

public class BasicCalculator {

    // Function for addition
    public static double add(double num1, double num2) {
        return num1 + num2;  // Adding two numbers
    }

    // Function for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;  // Subtracting second number from first
    }

    // Function for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;  // Multiplying two numbers
    }

    // Function for division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;  // Dividing first number by second if not zero
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN;  // Returning NaN (Not a Number) for invalid division
        }
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Displaying menu options to the user
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Taking the user's choice
        int choice = scanner.nextInt();

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;  // Variable to store the result

        // Performing the operation based on user's choice
        switch (choice) {
            case 1:
                result = add(num1, num2);  // Calling the add function
                break;
            case 2:
                result = subtract(num1, num2);  // Calling the subtract function
                break;
            case 3:
                result = multiply(num1, num2);  // Calling the multiply function
                break;
            case 4:
                result = divide(num1, num2);  // Calling the divide function
                break;
            default:
                System.out.println("Invalid choice!");  // Handling invalid input
                return;
        }

        // Displaying the result
        System.out.println("Result: " + result);
        scanner.close();  // Closing the scanner object
    }
}
