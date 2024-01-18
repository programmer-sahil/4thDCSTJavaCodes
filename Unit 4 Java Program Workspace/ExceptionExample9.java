class ExceptionExample9 {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}


/* Above prg can also be re-written as 

class ExceptionExample9 {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

// We know that all the exception classes 
// are subclasses of the Exception class. 
// So, instead of catching multiple specialized exceptions, 
// we can simply catch the Exception class.

*/