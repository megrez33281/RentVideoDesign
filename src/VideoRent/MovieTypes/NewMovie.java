package VideoRent.MovieTypes;

public class NewMovie implements MovieTypes{
	private int BasePrice = 3;
	private int BaseDays = 1;
	private float DelayPrice = 3;
	private float CustomerPoints = (float)2.0;
	
	public float CustomerPoint() {
		return CustomerPoints;
	}
	public float RentPrice(int days) {
		return BasePrice + Math.max(0, days-BaseDays)*DelayPrice;
	}


}
