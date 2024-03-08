// This is a simple Java program for beginners demonstrating if-else-if statements.
public class IfElseIfExample {

    public static void main(String[] args) {
        // Sample variables
        int number = 10;

        // If-else-if statements to check the value of 'number'
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Another example with multiple conditions
        int age = 25;

        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 21) {
            System.out.println("You are a young adult.");
        } else {
            System.out.println("You are an adult.");
        }

        // Yet another example with string comparison
        String dayOfWeek = "Monday";

        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println("It's the weekend!");
        } else if (dayOfWeek.equals("Friday")) {
            System.out.println("It's Friday, almost the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
