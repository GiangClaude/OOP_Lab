package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String> ();
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	
	

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public List<String> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Add new author successfully!");
		}
		else System.out.println("The author is exist!");
		
	}
	
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.remove(authorName);
		}
		else System.out.println("The author is not exist!");
	}
	
	public String toString() {
		String returnString =  "Book: " + this.getTitle() + 
				" - Category: " + this.getCategory() + " - Author: ";
		for (String author: this.authors) {
			returnString += author + ", ";
		}
		returnString += " - Cost: " + this.getCost() + "$";
		return returnString;
	}

}
