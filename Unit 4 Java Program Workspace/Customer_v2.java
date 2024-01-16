import java.util.*;

public class Customer_v2 {
 
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
  
public void setfirstName(String firstName){
	this.firstName = firstName;
}

public String getfirstName(){
	return this.firstName;
}

public void setDob(Date dob){
	this.dob = dob;
}

public Date getDob(){
	return this.dob;
}

public void setAge(int age){
	this.age = age;
}

public int getAge(){
	return this.age;
}


public static void main(String[] args) {
    Customer_v2 c1 = new Customer_v2();
    c1.setlastName("Sharma");
    System.out.println(c1.getlastName());

    c1.setfirstName("kapil");
    System.out.println(c1.getfirstName());
    
    // Date(int year, int month, int date)
    
    Calendar cal = Calendar.getInstance();
    cal.set(1981, 3, 2);  // Indexing starts from 0
    c1.setDob(cal.getTime());  // 2nd April 1981
    System.out.println(c1.getDob());

    c1.setAge(32);
    System.out.println(c1.getAge());

  }
  
} 
