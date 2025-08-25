package sample;

import java.util.HashMap;

import java.util.Map;


public class BookInfo {
	public static void main(String[] args) {
		Map<Integer,Book>bookMap= new HashMap<>();
		
	Book b1=new Book(1,"Java basics","James gosling",50);
	Book b2=new Book(2,"python","Charles",60);
	Book b3=new Book(3,"C++","Harry",70);
	
	bookMap.put(b1.getId(),b1);
	bookMap.put(b2.getId(),b2);
	bookMap.put(b3.getId(),b3);
	
	for(Map.Entry<Integer, Book> entry: bookMap.entrySet()) {
		Book book=entry.getValue();
		System.out.println("Id:"+ book.getId());
		System.out.println("title:"+ book.getTitle());
		System.out.println("author:"+ book.getAuthor());
		System.out.println("price:"+ book.getPrice());
	}
		

	}
}
