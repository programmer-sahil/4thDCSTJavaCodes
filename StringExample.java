// This is a simple Java program for beginners demonstrating strings and their methods.
public class StringExample {

    public static void main(String[] args) {
        // Creating a string
        String greeting = "Hello, World!";

        // Displaying the original string
        System.out.println("Original String: " + greeting);

        // Getting the length of the string
        int length = greeting.length();
        System.out.println("Length of the String: " + length);

        // Converting the string to uppercase
        String upperCaseString = greeting.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);

        // Checking if the string contains a specific substring
        boolean containsWorld = greeting.contains("World");
        System.out.println("Does the string contain 'World'? " + containsWorld);

        // Extracting a substring from the original string
        String substring = greeting.substring(0, 5);
        System.out.println("Substring: " + substring);

        // Concatenating strings
        String additionalGreeting = ", Java!";
        String finalGreeting = greeting.concat(additionalGreeting);
        System.out.println("Concatenated String: " + finalGreeting);
    }
}



// greeting is a string containing the initial greeting.
// The length() method is used to find the length of the string.
// The toUpperCase() method converts the string to uppercase.
// The contains() method checks if the string contains a specific substring.
// The substring() method extracts a portion of the string.
// The concat() method is used to concatenate two strings.