
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", 
				"Adsdd", "Roger Allers", 87, 20f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The lion King", 
				"dsdsa", "Roger Allers", 87, 20f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The lion King", 
				"sdsđs", "Roger Allers", 87, 20f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		//Remove by number in Order list
//		anOrder.removeDigitalVideoDisc(0);
		System.out.println("Total cost is: " + anOrder.totalCost());
		//See infor DigitalVideoDisc by Orderlist
		anOrder.seeInfo(0);
		anOrder.seeInfo(1);
		anOrder.seeInfo(2);
	}

}
