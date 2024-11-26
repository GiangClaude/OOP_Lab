import java.util.ArrayList;

public class StoreClass {
	private ArrayList<DigitalVideoDisc> itemsStore = new ArrayList<>();
	void addDVD(DigitalVideoDisc dvd) {
			itemsStore.add(dvd);
			System.out.println("The disc has been added!");
	}	
	
	void removeDVD(int id) {
		boolean found = false;
		for (DigitalVideoDisc dvd: itemsStore) {
			if (dvd.getID() == id) {
				itemsStore.remove(dvd);
				found = true;
				break;
			}
		}
		if (found == false) System.out.println("There isnt any dvd have id " + id + " in store");
	}
	
	void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Store Items: ");
		for (DigitalVideoDisc a: itemsStore) {
			System.out.println(a.getID() + ". DVD - " + a.getTitle() + " - " + a.getCategory() 
					+ " - " + a.getDirector() + " - " + a.getLength() + ": " + a.getCost() + "$"
					);
		}
	}
	
	void removeDVD(DigitalVideoDisc dvd) {
		itemsStore.remove(dvd);
	}
	
}
