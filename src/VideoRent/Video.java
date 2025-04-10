package VideoRent;

public class Video {
	private String VideoID;
	private Movie movie;
	Video(String VideoID, Movie movie){
		this.VideoID = VideoID;
		this.movie = movie;
	}
	private int CountPrice(int baseDays, int basePrices, int OverDuePrice, int RealDays) {
		return basePrices + Math.max(0, RealDays-baseDays)*OverDuePrice;
	}
	public int getPrice(int days) {
		MovieType type = movie.getMovieInfo();
		if(type == MovieType.NEW) {
			return CountPrice(1, 3, 2, days);
		}
		else if(type == MovieType.OLD) {
			return CountPrice(3, 2, 1, days);
		}
		else {
			return CountPrice(5, 2, 1, days);
		}
	}
	public float getPoints() {
		MovieType type = movie.getMovieInfo();
		if(type == MovieType.NEW) {
			return (float)2.0;
		}
		else if(type == MovieType.OLD) {
			return (float)1.0;
		}
		else {
			return (float)0.5;
		}
	}
	public String getMovieName(){
		return movie.getMovieName();
	}
}
