package VideoRent;

import java.util.ArrayList;

public class RentRecord {

	private ArrayList<RecordEntry> RecordList;
	RentRecord(){
		RecordList = new ArrayList<RecordEntry>();
	}	
	public void rentVideo(Customer customer, Video video, int days) {
		float price = video.getPrice(days);
		float points = video.getPoints();
		RecordEntry entry = new RecordEntry(customer, video, days, price, points);
		RecordList.add(entry);
		customer.addHistory(entry);
	}

}
