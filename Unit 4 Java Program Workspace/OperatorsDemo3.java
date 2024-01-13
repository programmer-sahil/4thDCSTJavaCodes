public class OperatorsDemo3 {
 
public static void main(String[] args) {
    float monthlySal = 35000.0f;
    byte age = 23;
    float HousingLoanApplied = 1000000.0f;
    boolean result;
    // Check whether Loan can be sanctioned or not
    // Case 1 : (age < 30 or monthlySal > 45000) AND loanAmt < 8 Lacs
    // case 2 : (age < 30 or monthlySal > 65000) AND loanAmt < 10 Lacs
    if(monthlySal > 45000 && monthlySal <= 65000 ) { 
      result = (age < 30) && (HousingLoanApplied<=800000); 
      if(result) 
        System.out.println("Loan is sanctioned, visit bank branch with documents");
      else 
        System.out.println("Lesser Loan may be sanctioned, visit branch");
    }
   else {
      result = (age < 30) && (HousingLoanApplied<1000000); 
      if(result) 
        System.out.println("Loan is sanctioned, visit bank branch with documents");
      else 
        System.out.println("Lesser Loan may be sanctioned, visit branch");
   }

  }
} 
