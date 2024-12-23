package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Media implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }
	
	public CompactDisc(String artist, ArrayList<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
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
		if (!tracks.contains(trackName)) {
			tracks.add(trackName);
			System.out.println("Add new track successfully!");
		}
		else System.out.println("The track is exist!");
		
	}
	
	public void removeTrack(Track trackName) {
		if (!tracks.contains(trackName)) {
			tracks.remove(trackName);
		}
		else System.out.println("The track is not exist!");
	}
	
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("The artist: " + artist);
		for (Track a : tracks) {
			a.play();
		}
	}
	
	public String toString() {
		String returnString =  "CD: " + this.getTitle() + 
				" - Artist: " + this.getArtist() +
				" - Category: " + this.getCategory() + " - Tracks: ";
		for (Track track: this.tracks) {
			returnString += track.getTitle() + "(" + track.getLength() + ") ";
		}
		returnString += " - Cost: " + this.getCost() + "$";
		return returnString;
	}
	
}
