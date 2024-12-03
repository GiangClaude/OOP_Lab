package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class StoreClass {
	private ArrayList<Media> itemsStore = new ArrayList<>();
	public void addMedia(Media dvd) {
			itemsStore.add(dvd);
			System.out.println("The media has been added!");
	}	
	
	public void removeMedia(Media m) {
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
	
	public void searchById(int id) {
        boolean found = false;
        for (Media dvd : itemsStore) {
	           if (dvd.getId() == id) {
	        	   System.out.println(dvd.toString());
	                found = true;
	                break;
	            }
	        }
 
        if (!found) {
            System.out.println("No media found with ID: " + id);
        }
    }
    
    public Media searchByTitle(String title) {
  	  boolean found = false;

	        for (Media dvd : itemsStore) {
	            if (dvd.isMatch(title)) {
	                System.out.println(dvd.toString());
	                found = true;
	                return dvd;
	            }
	        }

	        if (!found) {
	            System.out.println("No media found with title: " + title);
	        }
	        return null;
  }
	
}
