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
		this.setId(nbDigitalVideoDisc);
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost); 
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost); 
	}
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
		this.setTitle(title);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDisc++;
		this.setId(nbDigitalVideoDisc);
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost); 
		this.setLength(length); 
	}
	
	
	public String toString() {
		return "DVD: " + this.getTitle() + 
				" - Category: " + this.getCategory() + 
				" - Director: " + this.getDirector() + 
				" - DVD length: " + this.getLength() + 
				" - Cost: " + this.getCost() + "$";
	}
	
	public boolean isMatch(String title) {
		return this.getTitle().toLowerCase().contains(title.toLowerCase());
	}
	
}
