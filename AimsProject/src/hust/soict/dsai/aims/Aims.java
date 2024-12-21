package hust.soict.dsai.aims;
import java.util.Scanner;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	
	static int num;
	static String str;
	static Store itemStore = new Store();
	static Cart anOrder = new Cart();
	static Media o1 = new Media();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws LimitExceededException {
		
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", 
				"Animation", "Roger Allers", 87, 20f);
		anOrder.addMedia(dvd1);
		itemStore.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The lion", 
				"Animatiddsn", "Roger Allers", 87, 20f);
		anOrder.addMedia(dvd2);
		itemStore.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The King", 
				"Animasd", "Roger Allers", 87, 20f);
		anOrder.addMedia(dvd3);
		itemStore.addMedia(dvd3);
		showMenu();
		System.out.println("Have a good day! Thank you so much!");
		return;
	}
	
	public static void showMenu() throws LimitExceededException {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		num = Integer.parseInt(in.nextLine());
		switch(num) {
				case 1: storeMenu();
						break;
				case 2: updateStoreMenu();
						break;
				case 3: 
					anOrder.print();
					cartMenu();
					break;
				case 0: return;
				default: System.out.print("Something went wrong! Please enter again!");
						showMenu();
						
		}
		showMenu();
		
	}
	
	public static void cartMenu() {
		System.out.println("Options CartMenu: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		num = Integer.parseInt(in.nextLine());
		switch(num) {
				case 1: FilterCart();
						break;
				case 2: SortCart();
						break;
				case 3: 
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = anOrder.searchByTitle(str);
					if (o1 != null) {
						anOrder.removeMedia(o1);
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						cartMenu();
					}
					break;
				case 4:
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = anOrder.searchByTitle(str);
					if (o1 != null) {
						if (o1.getClass() == Book.class) System.out.println("This media is Book, can not play!");
						else o1.play();
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						cartMenu();
					}
					break;
				case 5:
					System.out.println("A new Order is created!");
					anOrder.clearCart();
					break;
				case 0: return;
				default: System.out.print("Something went wrong! Please enter again!");
						cartMenu();
						
		}
		cartMenu();
	}
	
	public static void SortCart() {
		System.out.println("Enter 1 or 2 to Sort by Cost or Title");
		int choose = Integer.parseInt(in.nextLine());;
		if (choose == 1) {
			anOrder.sortByCost();
		}
		else if (choose == 2) {
			anOrder.sortByTitle();
		}
		return;
	}
	
	public static void FilterCart() {
		System.out.println("Enter 1 or 2 to Filter by ID or Title");
		int choose = Integer.parseInt(in.nextLine());;
		if (choose == 1) {
			System.out.println("Plese enter the id: ");
			num = Integer.parseInt(in.nextLine());
			anOrder.searchById(num);
		}
		else if (choose == 2) {
			System.out.println("Plese enter the title: ");
			str = in.nextLine();
			anOrder.searchByTitle(str);
		}
		return;
	}
	
	public static void updateStoreMenu() {
		System.out.println("Options updateStore: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a media");
		System.out.println("2. Remove a media");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		num = Integer.parseInt(in.nextLine());
		switch(num) {
				case 1:	
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = itemStore.searchByTitle(str);
					if (o1 != null) {
						itemStore.addMedia(o1);
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						updateStoreMenu();
					}
					break;
				case 2:
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = itemStore.searchByTitle(str);
					if (o1 != null) {
						itemStore.removeMedia(o1);
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						updateStoreMenu();
					}
					break;
				case 0: return;
				default: System.out.print("Something went wrong! Please enter again!");
						updateStoreMenu();	
					
		}
		updateStoreMenu();	
	}
	
	public static void storeMenu() throws LimitExceededException {
		System.out.println("Options store: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		num = Integer.parseInt(in.nextLine());
		
		switch(num) {
				case 1: 
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = itemStore.searchByTitle(str);
					if (o1 != null) {
						if (o1.getClass() != Book.class) mediaDetailsMenuforCDDVD(o1);
						else mediaDetailsMenuforBook(o1);
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						storeMenu();
					}
					break;
				case 2:
					itemStore.print();
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = itemStore.searchByTitle(str);
					if (o1 != null) {
						anOrder.addMedia(o1);
						if (o1.getClass() == DigitalVideoDisc.class) {
							System.out.println("Number of Medias: " + anOrder.Count_Number);
						}
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						storeMenu();
					}
					break;
				case 3:
					itemStore.print();
					System.out.println("Plese enter the title: ");
					str = in.nextLine();
					o1 = itemStore.searchByTitle(str);
					if (o1 != null) {
						o1.play();
					}	
					else {
						System.out.println("The title is not exist, plese choose another");
						storeMenu();
					}
					break;
				case 4:
					anOrder.print();
				case 0: return;
				default: System.out.print("Something went wrong! Please enter again!");
						storeMenu();	
			}
	storeMenu();
		
	}
	
	public static void mediaDetailsMenuforCDDVD(Media o1) throws LimitExceededException {
		System.out.println("Options MediaDetails: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		num = Integer.parseInt(in.nextLine());
		if (num == 1) anOrder.addMedia(o1);
		else if (num == 2) o1.play();
		else if (num == 0) storeMenu();
		else {
			System.out.print("Something went wrong! Please enter again!");
			mediaDetailsMenuforCDDVD(o1);
		}
	}
	
	public static void mediaDetailsMenuforBook(Media o1) throws LimitExceededException {
		System.out.println("Options MediaDetails: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		num = Integer.parseInt(in.nextLine());
		if (num == 1) anOrder.addMedia(o1);
		else if (num == 0) storeMenu();
		else {
			System.out.print("Something went wrong! Please enter again!");
			mediaDetailsMenuforBook(o1);
		}
	}





}
