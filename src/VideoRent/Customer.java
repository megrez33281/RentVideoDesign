package VideoRent;

public class Customer {
	private String CustomerID;
	private String Name;
	private float Points;
	Customer(String CustomerID, String Name){
		this.CustomerID = CustomerID;
		this.Name = Name;
		Points = 0;
	}
	public void addPoints(float points) {
		Points += points;
	}
	public float getPoints() {
		return Points;
	}
	public String getName() {
		return Name;
	}
	public String getID() {
		return CustomerID;
	}
}
