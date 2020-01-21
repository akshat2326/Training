package com.robomq.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.robomq.collection.Product;

public class BookList {
	
	public static void main(String[] args) {
		ArrayList<Book> books =  new ArrayList<Book>();
	
		books.add(new Book(1, "The Secret", "Rhonda Byrne", "American Publishers", 89));
		books.add(new Book(2, "The Power", "Akshat Mathur", "SD Publishers", 67));
		books.add(new Book(3, "Rich Dad Poor Dad", "Disha Mathur", "British Publishers", 100));
		books.add(new Book(4, "The Magic of Thinking Big", "David", "UK Prints", 2));
		books.add(new Book(5, "OCP", "Cathy Sierra", "Green Bird", 45));
		int z ;
		Scanner scan = new Scanner(System.in);
        Iterator itr = books.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			Book b = (Book) obj;
			System.out.println(b.getName());
			
		}
		while(true)
		{
			System.out.print("Enter 1 to sort by Id \n Enter 2 to sort by Name \n Enter 3 to sort by Author \n Enter 4 to sort by Publisher \n Enter 5 to sort by Quantity \n Enter 6 to exit");
			z = scan.nextInt();
			if(z == 1 )
			{
				System.out.println("\nSorted By Book Id \n");
				SortBookById i=new SortBookById();
				books.sort(i);
				System.out.println(books);
				continue;
			}
			if( z == 2 )
			{
				System.out.println("\nSorted By Book Name \n");
				SortBookByName n=new SortBookByName();
				books.sort(n);
				System.out.println(books);
				continue;
			}
			if(z == 3)
			{
				
					System.out.println("\nSorted By Book Author \n");
					SortBookByAuthor a=new SortBookByAuthor();
					books.sort(a);
					System.out.println(books);
					continue;
			}
			if(z == 4)
			{
				System.out.println("\nSorted By Book Publisher \n");
				SortBookByPublisher p=new SortBookByPublisher();
				books.sort(p);
				System.out.println(books);
				continue;
			}
			if(z==5) {
				System.out.println("\nSorted By Book Quantity \n");
				SortBookByQuantity q=new SortBookByQuantity();
				books.sort(q);
				System.out.println(books);
				continue;
			}
			if(z==6)
			break;
		}
	}
}
