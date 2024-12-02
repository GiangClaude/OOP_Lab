package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Media {
	private static int nbDigitalVideoDisc;
	private String director;
	private int length;
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	
	public String toString() {
		return "DVD: " + this.title + 
				" - Category: " + this.category + 
				" - Director: " + this.director + 
				" - DVD length: " + this.length + 
				" - Cost: " + this.cost + "$";
	}
	
	public boolean isMatch(String title) {
		return this.title.toLowerCase().contains(title.toLowerCase());
	}
	
}
