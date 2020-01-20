
public class JournalPaper extends WrittenItem {

	 private int year ;

	public JournalPaper(int idNumber, String title, int numberOfCopies, String author, int year) {
		super(idNumber, title, numberOfCopies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
 public void display() {
		 
	 }
	 
	 

}
