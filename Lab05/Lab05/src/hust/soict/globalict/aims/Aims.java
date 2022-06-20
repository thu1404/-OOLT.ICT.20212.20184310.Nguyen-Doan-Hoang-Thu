package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
    	
    	Order anOrder = new Order();
    	anOrder.createOrder("April 1st 2020");
    	//DVD1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        //anOrder.addDigitalVideoDisc(dvd1);


        //DVD2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        //anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd1,dvd2);
        
        //DVD3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);
   
        anOrder.print();
    }
}


