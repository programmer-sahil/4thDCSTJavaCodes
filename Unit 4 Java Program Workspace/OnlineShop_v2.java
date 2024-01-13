import java.util.*;

public class OnlineShop_v2 {
public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.setlastName("Sharma");
    System.out.println(c1.getlastName());

    c1.setfirstName("kapil");
    System.out.println(c1.getfirstName());
    
    c1.setPremiumCustomer(true);

    ShoppingCart sc1 = new ShoppingCart();
    sc1.setQuantityProducts(4.0f);
    sc1.setproductSum(1000.0f);
    sc1.setCouponsHonored(true);
    float billedAmount = sc1.calculateSum(c1);
    System.out.println("Invoice Amount is " + billedAmount);

  }
}


// Independent Class
class Customer {
 
private String lastName;
private String firstName;
private boolean premiumCustomer;

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

boolean isPremiumCustomer(){
  return premiumCustomer;
}

public void setPremiumCustomer(boolean premiumCustomer){
    this.premiumCustomer = premiumCustomer; 
}
} 

// Independent Class
class ShoppingCart {
 
private float quantityProducts;
private float productSum;
private boolean couponsHonored;

public void setQuantityProducts(float quantityProducts){
	this.quantityProducts = quantityProducts;
}

public void setproductSum(float productSum){
	this.productSum = productSum;
}

public void setCouponsHonored(boolean couponsHonored){
	this.couponsHonored = couponsHonored;
}

public float calculateSum(Customer c){
    float result = productSum;

    if(c.isPremiumCustomer()){
      result = productSum * 0.9f;
    }
    else {
      result = productSum * 1.0f;
    }
    return result;
}
}