package hust.soict.dsai.test.screen;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.screen.StoreScreen;


public class ScreenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Store store = new Store();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                                                 "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        Book bk1 = new Book();
		bk1.addAuthor("Ha");
		bk1.addAuthor("Hi");
		
		store.addMedia(bk1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                                                     "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
                                                     "Animation", 18.99f);
        store.addMedia(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin", 
                "Animation", 18.99f);
        store.addMedia(dvd4);
        
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin", 
                "Animation", 18.99f);
        store.addMedia(dvd5);
        
        Track t1 = new Track("Hai", 2);
		Track t2 = new Track("Hai", 2);
		CompactDisc cd1 = new CompactDisc();
		cd1.addTrack(t1);
		cd1.addTrack(t2);
        cd1.setTitle("Hello");
        cd1.setCost(12);
        
		store.addMedia(cd1);
		
        new StoreScreen(store);
	}

}
