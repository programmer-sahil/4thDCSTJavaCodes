// This is a simple Java program for beginners demonstrating functions, overloading, and function calls.
public class FunctionOverloadingExample {

    public static void main(String[] args) {
        // Function call with different parameter types
        greetUser("John");
        greetUser(25);

        // Function call with different number of parameters
        int sum = addNumbers(5, 7);
        int total = addNumbers(2, 3, 4);

        System.out.println("Sum of two numbers: " + sum);
        System.out.println("Sum of three numbers: " + total);
    }

    // Function definition for greeting a user with a name
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Function overloading - same function name but different parameter types
    static void greetUser(int age) {
        System.out.println("Hello, you are " + age + " years old!");
    }

    // Function definition for adding two numbers
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Function overloading - adding three numbers
    static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
