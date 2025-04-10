package VideoRent;

import java.util.ArrayList;

public class RentRecord {
	private class RecordEntry{
		public Customer customer;
		public Video video;
		public int days;
		public int price;
		RecordEntry(Customer customer, Video video, int days, int price){
			this.customer = customer;
			this.video = video;
			this.days = days;
			this.price = price;
		}
	}
	private ArrayList<RecordEntry> RecordList;
	RentRecord(){
		RecordList = new ArrayList<RecordEntry>();
	}	
	public void rentVideo(Customer customer, Video video, int days) {
		int price = video.getPrice(days);
		float points = video.getPoints();
		RecordEntry entry = new RecordEntry(customer, video, days, price);
		customer.addPoints(points);
		RecordList.add(entry);
	}
	public void printStatement(Customer customer) {
		System.out.println("===================");
		System.out.println(customer.getName()+ "曾經租過的片子：");
		int totalPrice = 0;
		for(RecordEntry entry:RecordList) {
			if(entry.customer.getID() == customer.getID()) {
				System.out.println(entry.video.getMovieName()+ "\t" + entry.days + " 天");
				totalPrice += entry.price;
			}
		}
		System.out.println("總消費金額：" + totalPrice + " $");
		System.out.println("常客積點總數：" + customer.getPoints());
		System.out.println("===================\n");
		
	}
}
