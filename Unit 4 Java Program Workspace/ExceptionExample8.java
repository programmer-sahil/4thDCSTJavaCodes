class ExceptionExample8 {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } 
  }
}

/* 
Run the code twice 
1st time as 
array[10] = 30 / 0;

next time as 
array[10] = 30 / 2;

*/