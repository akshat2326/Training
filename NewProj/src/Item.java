public abstract class Item{
	
	private int idNumber;
	private String title;
	private int numberOfCopies;
	
	
	public Item(int idNumber, String title, int numberOfCopies) {
		super();
		this.idNumber = idNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

    
	
   public abstract void display();
	
}
