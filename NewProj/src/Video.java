
public class Video extends MediaItem {
	

	private String director;
	private String genre;
	private int year_released;
   
	
	

	public Video(int idNumber, String title, int numberOfCopies, int runtime, String director, String genre,
			int year_released) {
		super(idNumber, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year_released = year_released;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear_released() {
		return year_released;
	}
	public void setYear_released(int year_released) {
		this.year_released = year_released;
	}
	
	public void display() {
		 
	 }

}
