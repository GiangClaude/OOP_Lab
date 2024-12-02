package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {

	private String artist;
	private ArrayList<Track> tracks;
	

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisc(String artist, ArrayList<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getArtist() {
		return artist;
	}
	
	public int getLength() {
		int length = 0;
		for (Track a : tracks) {
			length += a.getLength();
		}
		return length;
	}
	
	public void addTrack(Track trackName) {
		if ( tracks.contains(trackName)) {
			tracks.add(trackName);
			System.out.println("Add new track successfully!");
		}
		else System.out.println("The track is exist!");
		
	}
	
	public void removeTrack(Track trackName) {
		if ( tracks.contains(trackName)) {
			tracks.remove(trackName);
		}
		else System.out.println("The track is not exist!");
	}
	
}
