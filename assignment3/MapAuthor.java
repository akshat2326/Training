package com.robomq.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MapAuthor {
	public static void main(String[] args) {
		TreeMap <String, Author> authors = new TreeMap<String, Author>();
		authors.put("The Magic Of Thinking Big", new Author(22, "David", "London"));
		authors.put("Thr Secret", new Author(24,"Rhonda Byrne" , "America"));
		authors.put("The Power", new Author(24, "Rhonda Byrne", "America"));
		authors.put("Harry Potter", new Author(28, "JK Rowling", "Texas"));
		authors.put("Rich Dad Poor Dad", new Author(43, "Akshat Mathur", "London"));
		
		
//		Set<String> keys = authors.keySet();
//		for(String s : keys)
//		{
//			Author a =  authors.get(s);
//			System.out.println( s + ", "+ a.getName() + ", " + a.getAddress());
//		}
		
		
		MapAuthor moreThanOneBook  ;
        Set<String> keys1 = authors.keySet();//keys

 

        List<String> arrlist = new ArrayList<String>();
        
        
        for(String s: keys)
        {    
        	Author a = authors.get(s);//key-value
            System.out.println("\n" + s +" written By "+ a.getName()+" Residing at Address " +a.getAddress()+ "\n");
            
            if(arrlist.contains(a.getName())) {
            System.out.println("This writer has written more than 1 book");
            System.out.println(a);
            }
            arrlist.add(a.getName());
    }
        }

 

    private static char[] equals1(MapAuthor a) {
        // TODO Auto-generated method stub
        return null;
    }

 
		
		
	}


