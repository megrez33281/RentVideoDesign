package VideoRent;

public class Movie {
	private String MovieId;
	private String Name;
	private MovieType type;
	Movie(String MovieId, String Name, MovieType type){
		this.MovieId = MovieId;
		this.Name = Name;
		this.type = type;
	}
	public MovieType getMovieInfo() {
		return type;
	}
	public String getMovieName() {
		return Name;
	}
}
