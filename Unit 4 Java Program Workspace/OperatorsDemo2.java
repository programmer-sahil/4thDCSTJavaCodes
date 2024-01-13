public class OperatorsDemo2 {
 
public static void main(String[] args) {
    float monthlySal = 35000.0f;
    byte age = 23;
    float HousingLoanApplied = 1000000.0f;
    
    // Check whether Loan can be sanctioned or not
    // take   &&
    boolean result = (monthlySal > 33000) && ((age+25) < 50) && (HousingLoanApplied<=1000000); 
    if(result) 
    System.out.println("Loan is sanctioned, visit bank branch with documents");
    else 
    System.out.println("Lesser Loan may be sanctioned, visit branch");
    
  }
} 
