package VideoRent;

public class Customer {
	private String CustomerID;
	private String Name;
	Customer(String CustomerID, String Name){
		this.CustomerID = CustomerID;
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public String getID() {
		return CustomerID;
	}
}
