package VideoRent.MovieTypes;

public class NewMovie implements MovieTypes{
	private int BasePrice = 3;
	private int BaseDays = 1;
	private int DelayPrice = 2;
	private float CustomerPoints = (float)2.0;
	
	public float CustomerPoint() {
		return CustomerPoints;
	}
	public int RentPrice(int days) {
		return BasePrice + Math.max(0, days-BaseDays)*DelayPrice;
	}


}
