// This is a simple Java program for beginners demonstrating the usage of functions or methods.
public class FunctionExample {

    public static void main(String[] args) {
        // Calling a simple function to print a welcome message
        printWelcomeMessage();

        // Calling a function with parameters
        int sum = addNumbers(5, 7);
        System.out.println("Sum of numbers: " + sum);

        // Calling a function with a return value
        double result = calculateSquare(4.5);
        System.out.println("Square of a number: " + result);
    }

    // Function to print a welcome message
    static void printWelcomeMessage() {
        System.out.println("Welcome to the Java Functions Example!");
    }

    // Function to add two numbers and return the result
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Function to calculate the square of a number and return the result
    static double calculateSquare(double num) {
        return num * num;
    }
}
