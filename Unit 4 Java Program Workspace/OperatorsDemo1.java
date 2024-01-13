public class OperatorsDemo1 {
 
public static void main(String[] args) {
    byte num1 = 21;
    byte num2 = 40;
    
    // Check whether number is odd / even 
    // take   %2
    int result = num1 % 2; // remember - Always hold result of an arthimatic expression in int type
    if(result == 0) 
    System.out.println( num1 + " is even");
    else 
    System.out.println( num1 + " is odd");

    result = num2 % 2;  
    if(result == 0) 
    System.out.println( num2 + " is even");
    else 
    System.out.println( num2 + " is odd");
  }
} 
