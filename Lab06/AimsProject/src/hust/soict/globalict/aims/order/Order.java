package hust.soict.globalict.aims.order;

import hust.soict.globalict.aims.utils.MyDate;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;

    public static final int MAX_LIMITED_ORDERS = 5;

    private static final ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private static int nOrders = 0;
    private MyDate dateOrdered;

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
        } else System.out.println("Max order size achieved");
    }

    public void removeMedia(int mediaIndex) {
        if (mediaIndex >= 0) {
            itemsOrdered.remove(mediaIndex);
        }
    }

    public float totalCost() {

        float sum = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            sum += itemsOrdered.get(i).getCost();
        }
        return sum;
    }

    public void createOrder(String date) {
        dateOrdered = new MyDate(date);
        if (nOrders <= MAX_LIMITED_ORDERS) {
            nOrders++;
        } else {
            System.out.println("MAX ORDER REACHED");
        }

    }

    public void print() {
        System.out.println("***********************Order***********************");
        System.out.println("Ordered Items: ");
        System.out.println("Type   Name    Category   Price");
        int count = 0;
        for (Media item : itemsOrdered) {
            System.out.println((count + 1) + ".DVD-" + item.getTitle() + "-"
                    + item.getCategory() + "-"
                    + item.getCost() + "$");
            count++;
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    // get lucky disc
    public void getALuckyItem() {

        int max = itemsOrdered.size();
        int min = 0;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;

        itemsOrdered.get(rand).setCost(0);
        itemsOrdered.get(rand).setTitle(itemsOrdered.get(rand).getTitle() + "[FREE]");
        System.out.println(rand);
    }
}
