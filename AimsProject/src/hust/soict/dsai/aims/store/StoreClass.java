package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class StoreClass {
	private ArrayList<Media> itemsStore = new ArrayList<>();
	public void addDVD(Media dvd) {
			itemsStore.add(dvd);
			System.out.println("The media has been added!");
	}	
	
	public void removeDigitalVideoDisc(Media m) {
		if (!itemsStore.contains(m)) {
			itemsStore.remove(m);
		}
		else System.out.println("Media is not exist!");
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Store Items: ");
		for (Media a: itemsStore) {
			a.toString();
			System.out.println("\n");
		}
	}
	
}
