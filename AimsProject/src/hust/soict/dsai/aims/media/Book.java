package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String> ();
	public Book() {
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
	
	

}
