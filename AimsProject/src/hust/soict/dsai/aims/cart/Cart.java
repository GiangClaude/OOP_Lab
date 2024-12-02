package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public int Count_Number;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public float totalCost() {
		float total = 0;
		for (Media a : itemsOrdered) {
			total += a.getCost();
		}
		return total;
	}
	
	public void addMedia(Media mda) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered.add(mda);
			Count_Number++;
			System.out.println("The disc has been added!");
		}
	}	
	
	public void removeMedia(Media m) {
		if (!itemsOrdered.contains(m)) {
			itemsOrdered.remove(m);
			Count_Number--;
		}
		else System.out.println("Media is not exist!");
	}	
	
	
	public void seeInfo(int id) {
		for (Media a : itemsOrdered) {
	           if (a.getId() == id) {
	        	   a.toString();
	               break;
	            }
	        }
		
	}
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (Media a: itemsOrdered) {
			System.out.println(a.getId() + ". DVD - " + a.getTitle() + " - " + a.getCategory() 
					+ ": " + a.getCost() + "$"
					);
		}
	}
	

	public void searchById(int id) {
	        boolean found = false;
	        for (Media dvd : itemsOrdered) {
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
	 

	    // Search for DVD by Title
	    public void searchByTitle(String title) {
	    	  boolean found = false;

		        for (Media dvd : itemsOrdered) {
		            if (dvd.isMatch(title)) {
		                System.out.println(dvd.toString());
		                found = true;
		                break;
		            }
		        }

		        if (!found) {
		            System.out.println("No media found with title: " + title);
		        }
	    }
	
	
}
