package VideoRent;

import java.util.ArrayList;

public class RentRecord {
	private class RecordEntry{
		public Customer customer;
		public Video video;
		public int days;
		public int price;
		public float points;
		RecordEntry(Customer customer, Video video, int days, int price, float points){
			this.customer = customer;
			this.video = video;
			this.days = days;
			this.price = price;
			this.points = points;
		}
	}
	private ArrayList<RecordEntry> RecordList;
	RentRecord(){
		RecordList = new ArrayList<RecordEntry>();
	}	
	public void rentVideo(Customer customer, Video video, int days) {
		int price = video.getPrice(days);
		float points = video.getPoints();
		RecordEntry entry = new RecordEntry(customer, video, days, price, points);
		RecordList.add(entry);
	}
	public void printStatement(Customer customer) {
		System.out.println("===================");
		System.out.println(customer.getName()+ "曾經租過的片子：");
		int totalPrice = 0;
		float totalCustomerPoints = 0;
		for(RecordEntry entry:RecordList) {
			if(entry.customer.getID() == customer.getID()) {
				System.out.println(entry.video.getMovieName()+ " " + entry.days + " 天 " + "花費：" + entry.price + "美元");
				totalPrice += entry.price;
				totalCustomerPoints += entry.points;
			}
		}
		System.out.println("總消費金額：" + totalPrice + " 美元");
		System.out.println("常客積點總數：" + totalCustomerPoints);
		System.out.println("===================\n");
		
	}
}
