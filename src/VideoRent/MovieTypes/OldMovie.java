package VideoRent.MovieTypes;

public class OldMovie implements MovieTypes {
	
	private int BasePrice = 3;
	private int BaseDays = 1;
	private int DelayPrice = 1;
	private float CustomerPoints = (float)1.0;
	
	public float CustomerPoint() {
		return CustomerPoints;
	}
	public int RentPrice(int days) {
		return BasePrice + Math.max(0, days-BaseDays)*DelayPrice;
	}


}
