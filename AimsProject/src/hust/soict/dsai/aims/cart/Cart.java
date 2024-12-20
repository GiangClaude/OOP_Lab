package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public int Count_Number;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	public float totalCost() {
		float total = 0;
		for (Media a : itemsOrdered) {
			total += a.getCost();
		}
		return total;
	}
	
	   // Add and remove media from cart
    public String addMedia(Media media) throws LimitExceededException {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            throw new LimitExceededException("ERROR: The number of media has reached its limit");
        } else if (itemsOrdered.contains(media)) {
            return(media.getTitle() + " is already in the cart!");
        } else {
            Count_Number +=1;
            itemsOrdered.add(media);
            return (media.getTitle() + " has been added!");
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
	    public Media searchByTitle(String title) {
	    	  boolean found = false;

		        for (Media dvd : itemsOrdered) {
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
	    
	    public void sortByTitle() {
	    	Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	    	this.print();
	    }
	    
	    public void sortByCost() {
	    	Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	    	this.print();
	    }
	    
	    public void clearCart() {
	    	itemsOrdered.clear();
	    }

		public ObservableList<Media> getItemsOrdered(){
			return itemsOrdered;
		}

		public String placeOrder() {
			if (itemsOrdered.size() == 0) {
	            return "Your cart is empty!";
	        } else {
	        	Count_Number = 0;
	            itemsOrdered.clear();
	            return "Order created!\n" + "Now your cart will be empty!";
	        }
		}
	
}
