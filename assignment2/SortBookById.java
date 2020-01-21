package com.robomq.assignment2;

import java.util.Comparator;

public class SortBookById implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int r= (b1.getId()-b2.getId());
		
		return r;
	}
}
