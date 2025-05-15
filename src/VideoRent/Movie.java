package VideoRent;

import VideoRent.MovieTypes.MovieTypes;
import VideoRent.MovieTypes.NewMovie;
import VideoRent.MovieTypes.OldMovie;
import VideoRent.MovieTypes.ChildMovie;

public class Movie {
	private String Name;
	private MovieTypes type;
	Movie(String Name, MovieType type){
		this.Name = Name;
		if(type == MovieType.NEW) {
			this.type = new NewMovie();
		}
		else if(type == MovieType.OLD) {
			this.type = new OldMovie();
		}
		else if(type == MovieType.CHILD) {
			this.type = new ChildMovie();
		}
		else {
			System.out.println("未知的片種");
		}
	}

	public String getMovieName() {
		return Name;
	}
	
	public float getMoviePrice(int days) {
		return type.RentPrice(days);
	}
	
	public float getCustomPoints() {
		return type.CustomerPoint();
	}
	
	public void ChangeMovieType(MovieTypes movieTypes) {
		//更改影片種類(新片、舊片、兒童片)
		this.type = movieTypes;
	}
	
}
