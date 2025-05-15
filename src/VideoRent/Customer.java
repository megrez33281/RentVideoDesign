package VideoRent;

import java.util.ArrayList;

public class Customer {

	private String Name;
	private ArrayList<RecordEntry> recordHistory = new ArrayList<RecordEntry>();

	Customer(String Name){
		this.Name = Name;

	}
	public String getName() {
		return Name;
	}
	public void addHistory(RecordEntry recordEntry) {
		recordHistory.add(recordEntry);
	}
	
	public void statement() {
		System.out.println("===================");
		System.out.println(this.getName()+ "曾經租過的片子：");
		int totalPrice = 0;
		float totalCustomerPoints = 0;
		for(RecordEntry entry:recordHistory) {
			System.out.println(entry.video.getMovieName()+ " " + entry.days + " 天 " + "花費：" + entry.price + "美元  " +  "獲得積點：" + entry.points );
			totalPrice += entry.price;
			totalCustomerPoints += entry.points;
			
		}
		System.out.println("總消費金額：" + totalPrice + " 美元");
		System.out.println("常客積點總數：" + totalCustomerPoints);
		System.out.println("===================\n");
	}
	

}
