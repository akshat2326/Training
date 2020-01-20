
public class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD(int idNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(idNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void display() {
		 
	 }
	

}
