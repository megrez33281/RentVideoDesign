package VideoRent;

public class Video {
	private String VideoID;
	private Movie movie;
	Video(String VideoID, Movie movie){
		this.VideoID = VideoID;
		this.movie = movie;
	}

	public int getPrice(int days) {
		return movie.getMoviePrice(days);
	}
	public float getPoints() {
		return movie.getCustomPoints();
	}
	public String getMovieName(){
		return movie.getMovieName();
	}
}
