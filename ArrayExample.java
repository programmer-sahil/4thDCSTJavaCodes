// This is a simple Java program for beginners demonstrating arrays and 2D arrays.
public class ArrayExample {

    public static void main(String[] args) {
        // Single-dimensional array
        int[] singleArray = {1, 2, 3, 4, 5};

        // Displaying elements of the single-dimensional array
        System.out.println("Single-dimensional Array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }
        System.out.println();

        // 2D array
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Displaying elements of the 2D array
        System.out.println("2D Array:");
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}



// singleArray is a single-dimensional array containing integers.
// twoDArray is a 2D array containing integer values arranged in rows and columns.
// The first loop iterates through the single-dimensional array and prints its elements.
// The nested loops iterate through the 2D array and print its elements row by row.