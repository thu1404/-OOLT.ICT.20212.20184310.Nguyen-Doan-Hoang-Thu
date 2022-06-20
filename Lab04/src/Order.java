public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    
    public static final int MAX_LIMITED_ORDERS = 5;
    
    private static int nOrders = 0;

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
        if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            System.out.println(itemsOrdered[qtyOrdered].getCost());
            setQtyOrdered(qtyOrdered + 1);
        } else
            System.out.print("MAX NUMBER OF ORDERS ACHIEVED");
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered + i] = dvdList[i];
            }
            qtyOrdered += dvdList.length;
        } else {
            System.out.println("Order full");
        }
    }

    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered + 1] = dvd1;
            System.out.println("Added " + dvd1.getTitle());
            qtyOrdered += 1;

            itemsOrdered[qtyOrdered + 1] = dvd2;
            System.out.println("Added " + dvd2.getTitle());
            qtyOrdered += 1;
        } else {
            System.out.println("Order Full");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc[] tmpItemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

        int j = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                i++;
            }
            tmpItemsOrdered[j] = itemsOrdered[i];
            j++;
        }
        itemsOrdered = tmpItemsOrdered;
        setQtyOrdered(qtyOrdered - 1);
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
        if (nOrders <= MAX_LIMITED_ORDERS) {
            nOrders++;
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
                    + itemsOrdered[i].getDirectory() + "-"
                    + itemsOrdered[i].getLength() + ": "
                    + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
