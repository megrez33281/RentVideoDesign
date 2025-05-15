package VideoRent.MovieTypes;

public class ChildMovie implements MovieTypes {
	
	private float BasePrice = (float)1.5;
	private int BaseDays = 3;
	private float DelayPrice = (float)1.5;
	private float CustomerPoints = (float)0.5;
	
	public float CustomerPoint() {
		return CustomerPoints;
	}
	public float RentPrice(int days) {
		return BasePrice + Math.max(0, days-BaseDays)*DelayPrice;
	}



}
