// This is a simple Java program for beginners demonstrating different types of loops.
public class LoopExample {

    public static void main(String[] args) {
        // Example of a for loop
        System.out.println("Example of a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example of a while loop
        System.out.println("\nExample of a while loop:");
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Iteration " + counter);
            counter++;
        }

        // Example of a do-while loop
        System.out.println("\nExample of a do-while loop:");
        int num = 1;
        do {
            System.out.println("Iteration " + num);
            num++;
        } while (num <= 5);

        // Looping through an array
        System.out.println("\nLooping through an array:");
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Watermelon"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
