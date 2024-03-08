// This is a simple Java program for beginners demonstrating different operators.
public class OperatorsExample {

    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;

        int sum = a + b;        // Addition
        int difference = a - b; // Subtraction
        int product = a * b;    // Multiplication
        int quotient = a / b;   // Division
        int remainder = a % b;  // Modulus

        // Display results of arithmetic operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        boolean isEqual = (a == b);     // Equal to
        boolean isNotEqual = (a != b);  // Not equal to
        boolean isGreaterThan = (a > b);// Greater than
        boolean isLessThan = (a < b);   // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
        boolean isLessOrEqual = (a <= b);    // Less than or equal to

        // Display results of relational operations
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than b? " + isGreaterThan);
        System.out.println("Is a less than b? " + isLessThan);
        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessOrEqual);

        // Logical operators
        boolean condition1 = true;
        boolean condition2 = false;

        boolean logicalAnd = (condition1 && condition2); // Logical AND
        boolean logicalOr = (condition1 || condition2);  // Logical OR
        boolean logicalNot = !condition1;                // Logical NOT

        // Display results of logical operations
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Increment and Decrement operators
        int x = 5;
        x++; // Increment
        System.out.println("After increment, x = " + x);

        int y = 8;
        y--; // Decrement
        System.out.println("After decrement, y = " + y);

        // Assignment operators
        int z = 10;
        z += 5; // Equivalent to z = z + 5
        System.out.println("After assignment, z = " + z);
    }
}
