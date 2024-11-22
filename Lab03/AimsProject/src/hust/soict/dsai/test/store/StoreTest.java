package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store(100);

        // Create new DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);

        // Test addDVD method
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Print store content after adding DVDs
        store.printStore();

        // Test removeDVD method
        store.removeDVD(dvd2); // Remove an existing DVD
        store.removeDVD(dvd2); // Attempt to remove a non-existing DVD

        // Print store content after removing DVDs
        store.printStore();
    }
}

