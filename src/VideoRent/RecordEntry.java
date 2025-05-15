package VideoRent;

public class RecordEntry {
	public Customer customer;
	public Video video;
	public int days;
	public float price;
	public float points;
	RecordEntry(Customer customer, Video video, int days, float price, float points){
		this.customer = customer;
		this.video = video;
		this.days = days;
		this.price = price;
		this.points = points;
	}

}
