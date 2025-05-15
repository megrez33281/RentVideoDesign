package VideoRent;

public class Video {
	private Movie movie;
	Video(Movie movie){
		this.movie = movie;
	}

	public float getPrice(int days) {
		return movie.getMoviePrice(days);
	}
	public float getPoints() {
		return movie.getCustomPoints();
	}
	public String getMovieName(){
		return movie.getMovieName();
	}
}
