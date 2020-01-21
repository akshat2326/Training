package com.robomq.assignment2;

import java.util.Comparator;

public class SortBookByPublisher implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		String name1=b1.getPublisher();
		String name2=b2.getPublisher();
		int r=name1.compareTo(name2);
		return r;
	}

}
