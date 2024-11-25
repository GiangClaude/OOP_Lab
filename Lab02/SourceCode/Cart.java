import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public int Count_Number;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

	void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered.add(dvd);
			Count_Number++;
			System.out.println("The disc has been added!");
		}
	}	
	
	void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			if (Count_Number + dvdList.length > MAX_NUMBERS_ORDERED)
				System.out.println("Too much to add to cart!");
			else {
				for (DigitalVideoDisc a:dvdList) {
					itemsOrdered.add(a);
					Count_Number++;
					System.out.println("The disc has been added!");
				}
			}
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			if (Count_Number + 2> MAX_NUMBERS_ORDERED)
				System.out.println("Just can add only 1 disc to cart!");
			else {
					itemsOrdered.add(dvd1);
					itemsOrdered.add(dvd2);
					Count_Number+=2;
					System.out.println("Two discs has been added!");
			}
		}
	}
	
	void removeDigitalVideoDisc(int arg) {
		itemsOrdered.remove(arg);
		Count_Number--;
	}
	float totalCost() {
		float total = 0;
		for (DigitalVideoDisc a : itemsOrdered) {
			total += a.getCost();
		}
		return total;
	}
	void seeInfo(int index) {
		DigitalVideoDisc a = itemsOrdered.get(index);
		System.out.println("DVD so: " + index);
		System.out.println("Title: " + a.getTitle());
		System.out.println("Category: " + a.getCategory());
		System.out.println("Diretor: " + a.getDirector());
		System.out.println("Length: " + a.getLength());
		System.out.println("Cost: " + a.getCost());
		System.out.println("-----------------------------");
	}
}
