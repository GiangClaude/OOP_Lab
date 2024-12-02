package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class StoreClass {
	private ArrayList<DigitalVideoDisc> itemsStore = new ArrayList<>();
	public void addDVD(DigitalVideoDisc dvd) {
			itemsStore.add(dvd);
			System.out.println("The disc has been added!");
	}	
	
	public void removeDVD(int id) {
		boolean found = false;
		for (DigitalVideoDisc dvd: itemsStore) {
			if (dvd.getId() == id) {
				itemsStore.remove(dvd);
				found = true;
				break;
			}
		}
		if (found == false) System.out.println("There isnt any dvd have id " + id + " in store");
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Store Items: ");
		for (DigitalVideoDisc a: itemsStore) {
			System.out.println(a.getId() + ". DVD - " + a.getTitle() + " - " + a.getCategory() 
					+ " - " + a.getDirector() + " - " + a.getLength() + ": " + a.getCost() + "$"
					);
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		itemsStore.remove(dvd);
	}
	
}
