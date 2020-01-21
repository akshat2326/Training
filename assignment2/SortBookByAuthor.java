package com.robomq.assignment2;

import java.util.Comparator;

public class SortBookByAuthor implements Comparator<Book>{
	
	
	public int compare(Book b1, Book b2) {
		String name1=b1.getAuthor();
		String name2=b2.getAuthor();
		int r=name1.compareTo(name2);
		return r;
	}
}
