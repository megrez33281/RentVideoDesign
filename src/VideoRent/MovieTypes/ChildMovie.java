package VideoRent.MovieTypes;

public class ChildMovie implements MovieTypes {
	
	private int BasePrice = 2;
	private int BaseDays = 5;
	private int DelayPrice = 1;
	private float CustomerPoints = (float)0.5;
	
	public float CustomerPoint() {
		return CustomerPoints;
	}
	public int RentPrice(int days) {
		return BasePrice + Math.max(0, days-BaseDays)*DelayPrice;
	}



}
