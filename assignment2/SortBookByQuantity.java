package com.robomq.assignment2;

import java.util.Comparator;

public class SortBookByQuantity  implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		int r= (b1.getQuantity()-b2.getQuantity());
		
		return r;
	}
	

}
