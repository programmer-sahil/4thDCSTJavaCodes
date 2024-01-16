import java.util.*;

public class Customer_v1 {
 
private String lastName;
private String firstName;
private Date dob;
private int age;

public void setlastName(String lastName){
	this.lastName = lastName;
}

public String getlastName(){
	return this.lastName;
}
  
  
public static void main(String[] args) {
    Customer_v1 c1 = new Customer_v1();
    c1.setlastName("Rocky");
    System.out.println(c1.getlastName());
  }
  
} 
