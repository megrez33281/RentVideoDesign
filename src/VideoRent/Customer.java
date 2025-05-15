package VideoRent;

public class Customer {

	private String Name;

	Customer(String Name){
		this.Name = Name;

	}
	public String getName() {
		return Name;
	}
	
	public void statement(RentRecord rentRecords) {
		rentRecords.printStatement(this);
	}
	

}
