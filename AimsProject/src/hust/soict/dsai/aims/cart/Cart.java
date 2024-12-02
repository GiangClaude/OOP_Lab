package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
			if (!itemsOrdered.contains(mda)) {
				itemsOrdered.add(mda);
				Count_Number++;
				System.out.println("The disc has been added!");
			}
			else System.out.println("The title has already exist!");
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
			System.out.println(a.toString());
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
	    
	    public void sortByTitle() {
	    	Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	    	this.print();
	    }
	    
	    public void sortByCost() {
	    	Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	    	this.print();
	    }
	
}
