package a;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered;
	
	public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            System.out.print("The disc has been added\n");
            System.out.println(itemsOrdered[qtyOrdered].getCost());
            setQtyOrdered(qtyOrdered + 1);
        }  else {
            System.out.print("The order is almost full\n");
        	}
    }
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc[] tmpItemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

        int i = 0;

        for (int j = 0; i < qtyOrdered; j++) {
            if (itemsOrdered[j] == disc) {
                j++;
            }
            tmpItemsOrdered[i] = itemsOrdered[j];
            i++;
        }
        itemsOrdered = tmpItemsOrdered;
        setQtyOrdered(qtyOrdered - 1);
    }

    public float totalCost() {
        float sum = 0;
        
        for (int j = 0; j < qtyOrdered; j++) {
            sum += itemsOrdered[j].getCost();
        }
        return sum;
    }

}
