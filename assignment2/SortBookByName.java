package com.robomq.assignment2;

import java.util.Comparator;

public class SortBookByName implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		String name1=b1.getName();
		String name2=b2.getName();
		int r=name1.compareTo(name2);
		return r;
	}
	

}
