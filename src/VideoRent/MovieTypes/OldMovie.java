package VideoRent.MovieTypes;

public class OldMovie implements MovieTypes {
	
	private int BasePrice = 2;
	private int BaseDays = 2;
	private float DelayPrice = (float)1.5;
	private float CustomerPoints = (float)1.0;
	
	public float CustomerPoint() {
		return CustomerPoints;
	}
	public float RentPrice(int days) {
		return (float)BasePrice + Math.max(0, days-BaseDays)*DelayPrice;
	}


}
