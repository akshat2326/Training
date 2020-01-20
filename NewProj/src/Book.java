
public class Book extends WrittenItem{
	
	 int book_pages;
	 String book_name;
	public Book(String title, int idNumber, int numberOfCopies, String author, int book_pages, String book_name) {
		super(idNumber, title, numberOfCopies, author);
		this.book_pages = book_pages;
		this.book_name = book_name;
	}
	
	 public int getBook_pages() {
		return book_pages;
	}

	public void setBook_pages(int book_pages) {
		this.book_pages = book_pages;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void display() {
		 
	 }
 
}
