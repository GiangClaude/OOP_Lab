package hust.soict.dsai.aims.media;

public class Disc extends Media {
	
	private String director;
	private int length;
	
	public Disc() {
		// TODO Auto-generated constructor stub
	}

	public Disc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
	
	
	
}
