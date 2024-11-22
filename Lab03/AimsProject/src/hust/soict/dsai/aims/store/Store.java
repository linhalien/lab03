package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int numItems;

    // Constructor initializes the store with a fixed size (e.g., 100 slots)
    public Store(int size) {
        itemsInStore = new DigitalVideoDisc[size];
        numItems = 0;
    }

	// Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (numItems < itemsInStore.length) {
            itemsInStore[numItems] = dvd;
            numItems++;
            System.out.println(dvd.getTitle() + " has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < numItems; i++) {
            if (itemsInStore[i].equals(dvd)) {
                found = true;
                // Shift the remaining items to fill the gap
                for (int j = i; j < numItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numItems - 1] = null; // Clear the last item slot
                numItems--;
                System.out.println(dvd.getTitle() + " has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println(dvd.getTitle() + " is not found in the store.");
        }
    }
    
    public void printStore() {
        System.out.println("*************** STORE ***************");
        for (DigitalVideoDisc dvd : itemsInStore) {
        	if (dvd != null) {
                System.out.println(dvd.toString());
        	}
        }
        System.out.println("*************************************");
    }
}
