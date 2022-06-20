package hust.soict.globalict.aims.order;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;

    public static final int MAX_LIMITED_ORDERS = 5;

    private static int nbOrders = 0;

    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered;

    private MyDate dateOrdered;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			setQtyOrdered(qtyOrdered + 1);
		}else {
			System.out.println("Order full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
        		for(int i=0;i<dvdList.length;i++) {
        			addDigitalVideoDisc(dvdList[i]);
        		}
        } else {
            System.out.println("Order full");
        }
    }
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
			if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
				addDigitalVideoDisc(dvd1);
				addDigitalVideoDisc(dvd2);
		    } else {
		        System.out.println("Order full");
	    }

	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > 0) {
			int i,j;
			for (j = i = 0; i < qtyOrdered; i++) {
		        if (itemsOrdered[i] != disc) {
		        	itemsOrdered[j] = itemsOrdered[i];
		            j++;
		        }
		    }
			setQtyOrdered(qtyOrdered - 1);
		}else {
			System.out.println("ORDERS ARE NULL ");
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
	}

    public void createOrder(String date) {
        dateOrdered = new MyDate(date);
        if (nbOrders <= MAX_LIMITED_ORDERS) {
            nbOrders++;
        } else {
            System.out.println("MAX ORDER REACHED");
        }
    }

    public void print() {
        System.out.println("***********************Order***********************");
        dateOrdered.print();
        System.out.println("Ordered Items: ");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ".DVD-" + itemsOrdered[i].getTitle() + "-"
                    + itemsOrdered[i].getCategory() + "-"
                    + itemsOrdered[i].getDirector() + "-"
                    + itemsOrdered[i].getLength() + ": "
                    + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    // get lucky disc
    public DigitalVideoDisc getALuckyItem() {
        int max = qtyOrdered - 1;
        int min = 0;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        itemsOrdered[rand].setCost(0f);
        itemsOrdered[rand].setCategory(itemsOrdered[rand].getCategory() + "(FREE) ");
        return itemsOrdered[rand];
    }
}
