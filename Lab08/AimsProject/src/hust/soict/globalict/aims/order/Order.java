package hust.soict.globalict.aims.order;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {
		public static final int MAX_NUMBERS_ORDERED = 10;
		public static final int MAX_LIMITED_ORDERS = 5;
		
		List<Media> itemsOrdered = new ArrayList<Media>();
    	private static int nbOrders = 0;
    	private int idOrder;
    	String dateOrdered;
    	Date dateOrder = new Date();
    	
    	private Order() {
            dateOrdered = dateOrder.toString();
            nbOrders++;
            if (nbOrders > MAX_LIMITED_ORDERS) {
                System.out.println("No more order");
            }
        }
    	
    	public Date getDateOrder() {
            return dateOrder;
        }

        public void setDateOrder(Date dateOrder) {
            this.dateOrder = dateOrder;
        }
		
		// add media
	    public void addMedia(Media med) {
	        if (itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
	            System.out.println("The order is almost full");
	        } else {
	            for (int i = 0; i < itemsOrdered.size(); i++) {
	                if (itemsOrdered.get(i).equals(med)) {
	                    System.out.println("Item is in order, can't add");
	                    return;
	                }
	            }
	            itemsOrdered.add(med);
	        }
	    }
	 // add media list
	    public void addMedia(Media[] medList) {
	        int count =0;
	        for(int i=0; i< medList.length; i++){
	            if(medList[i]!=null) count++;
	        }
	        if (itemsOrdered.size() + count > MAX_NUMBERS_ORDERED) {
	            System.out.println("The order is almost full");
	        } else {
	            for (int i = 0; i < count; i++) {
	                
	                    itemsOrdered.add(medList[i]);
	                
	            }
	        }
	    }
	    // add 2 media

	    public void addMedia(Media med1, Media med2) {
	        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
	            System.out.println("The order is almost full");
	        } else if (itemsOrdered.size() + 1 >= MAX_NUMBERS_ORDERED) {
	            System.out.println("Can add one more item");
	            itemsOrdered.add(med1);
	        } else {
	            itemsOrdered.add(med1);
	            itemsOrdered.add(med2);
	        }
	    }

	    public static Order createOrder() {
	        if (nbOrders > MAX_NUMBERS_ORDERED) {
	            System.out.println("No more order");
	            return null;
	        }
	        return new Order();
	    }	
		
		
		// show item
		public void showItem(Media med) {
	        if (med instanceof DigitalVideoDisc) {
	            DigitalVideoDisc tempDisc = (DigitalVideoDisc) med;
	            tempDisc.showDVD();
	            System.out.println("1-dvd-1");
	        }
	            if (med instanceof Book) {
	            Book tempBook = (Book) med;
	            tempBook.showBook();
	            System.out.println("1-book-1");
	        } 
	    }
		// show order
	    public void showOrder() {
	        System.out.println("***************** ORDER ********************");
	        System.out.println("Date: " + dateOrdered);
	        System.out.println("Order item");
	        for (int i = 0; i < itemsOrdered.size(); i++) {
	            System.out.print((i + 1) + ".");
	            showItem(itemsOrdered.get(i));
	        }
	        totalCost();
	    }

	    //remove item
	    public void removeMedia(int del) {
	        for (int i = 0; i < itemsOrdered.size(); i++) {
	            if ((i + 1) == del) {
	                itemsOrdered.remove(i);
	            }
	        }
	    }

	    // total cost of oder
	    public void totalCost() {
	        float totalcost = 0;
	        for (int i = 0; i < itemsOrdered.size(); i++) {
	            totalcost += itemsOrdered.get(i).getCost();
	        }
	        System.out.print("Total cost is : ");
	        System.out.println(totalcost);
	    }
		
//		public void getALuckyItem() {
//	        int max = qtyOrdered;
//	        int min = 0;
//	        int range = max - min + 1;
//	        int rand = (int) (Math.random() * range) + min;
//
//	        itemsOrdered[rand].setCost(0);
//	        itemsOrdered[rand].setTitle(itemsOrdered[rand].getTitle() + "[FREE]");
//	        System.out.println(rand);
//	    }
//		
}
