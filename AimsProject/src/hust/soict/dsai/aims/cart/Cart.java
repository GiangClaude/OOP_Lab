package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public int Count_Number;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered.add(dvd);
			Count_Number++;
			System.out.println("The disc has been added!");
		}
	}	
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc a:dvdList) {
			if (Count_Number == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
			} else {
				itemsOrdered.add(a);
				Count_Number++;
				System.out.println("The disc has been added!");
			}	
		}
	}
	
	public void addDigitalVideoDisc1(DigitalVideoDisc... dvd) {
		for (DigitalVideoDisc a:dvd) {
			if (Count_Number == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
			} else {
				itemsOrdered.add(a);
				Count_Number++;
				System.out.println("The disc has been added!");
			}	
		}
		
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			if (Count_Number + 2 > MAX_NUMBERS_ORDERED)
				System.out.println("Just can add one disc!");
			else {
					itemsOrdered.add(dvd1);
					itemsOrdered.add(dvd2);
					Count_Number+=2;
					System.out.println("Two discs has been added!");
			}
		}
	}
	
	public void removeDigitalVideoDisc(int arg) {
		itemsOrdered.remove(arg);
		Count_Number--;
	}
	public float totalCost() {
		float total = 0;
		for (DigitalVideoDisc a : itemsOrdered) {
			total += a.getCost();
		}
		return total;
	}
	public void seeInfo(int id) {
		for (DigitalVideoDisc a : itemsOrdered) {
	           if (a.getId() == id) {
	        	   System.out.println("DVD so: " + a.getId());
	       		System.out.println("Title: " + a.getTitle());
	       		System.out.println("Category: " + a.getCategory());
	       		System.out.println("Diretor: " + a.getDirector());
	       		System.out.println("Length: " + a.getLength());
	       		System.out.println("Cost: " + a.getCost());	       				System.out.println("-----------------------------");
	              
	                break;
	            }
	        }
		
	}
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (DigitalVideoDisc a: itemsOrdered) {
			System.out.println(a.getId() + ". DVD - " + a.getTitle() + " - " + a.getCategory() 
					+ " - " + a.getDirector() + " - " + a.getLength() + ": " + a.getCost() + "$"
					);
		}
	}
	

	public void searchById(int id) {
	        boolean found = false;
	        for (DigitalVideoDisc dvd : itemsOrdered) {
		           if (dvd.getId() == id) {
		        	   System.out.println(dvd.toString());
		                found = true;
		                break;
		            }
		        }
	 
	        if (!found) {
	            System.out.println("No DVD found with ID: " + id);
	        }
	    }
	 

	    // Search for DVD by Title
	    public void searchByTitle(String title) {
	    	  boolean found = false;

		        for (DigitalVideoDisc dvd : itemsOrdered) {
		            if (dvd.isMatch(title)) {
		                System.out.println(dvd.toString());
		                found = true;
		                break;
		            }
		        }

		        if (!found) {
		            System.out.println("No DVD found with ID: " + title);
		        }
	    }
	
	
}
