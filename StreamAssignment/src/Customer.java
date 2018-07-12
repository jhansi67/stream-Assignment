import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
	    @Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerAge=" + customerAge + ", customerDate=" + customerDate + "]";
	}
		public Customer(Long customerId, String customerName, String customerAddress, int customerAge, String customerDate) {
		super();
		CustomerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerAge = customerAge;
		this.customerDate = customerDate;
	}
		private static final long serialVersionUID = 1L;

private Long CustomerId;
private String customerName;
private String 	customerAddress;
private int customerAge;
private String customerDate;
public Long getCustomerId() {
	return CustomerId;
}
public void setCustomerId(Long customerId) {
	CustomerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public int getCustomerAge() {
	return customerAge;
}
public void setCustomerAge(int customerAge) {
	this.customerAge = customerAge;
}
public String getCustomerDate() {
	return customerDate;
}
public void setCustomerDate(String customerDate) {
	this.customerDate = customerDate;
}



}
