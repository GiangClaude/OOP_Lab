package hust.soict.dsai.test.media;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.*;

public class MediaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Media> medias = new ArrayList<>();
		ArrayList<Track> tracks = new ArrayList<>();
		Track t1 = new Track("Hai", 2);
		Track t2 = new Track("Hai", 2);
		
		Book bk1 = new Book();
		bk1.addAuthor("Ha");
		bk1.addAuthor("Hi");
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Hi", "humor", "Alex", 25);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Hi", "do", "Al", 25);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hi", "humor", "Alex", 25);
		CompactDisc cd1 = new CompactDisc();
		cd1.addTrack(t1);
		cd1.addTrack(t2);
		
		medias.add(bk1);
		medias.add(dvd1);
		medias.add(cd1);
		medias.add(dvd2);
		
		for (Media a: medias) {
			System.out.println(a.toString());
		}
		
	}

}
