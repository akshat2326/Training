public abstract class WrittenItem extends Item{
	private String author;

	public WrittenItem(int idNumber, String title, int numberOfCopies, String author) {
		super(idNumber, title, numberOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	
}
