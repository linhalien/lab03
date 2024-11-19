package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	    for (DigitalVideoDisc dvd : dvdList) {
	        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	            itemsOrdered[qtyOrdered] = dvd;
	            qtyOrdered++;
	            System.out.println("The disc " + dvd.getTitle() + " has been added.");
	            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
	                System.out.println("The cart is almost full.");
	            }
	        } else {
	            System.out.println("Cannot add more items. The cart is full.");
	            break;
	        }
	    }
	}

	//public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
	  //  for (DigitalVideoDisc dvd : dvds) {
	    //    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	      //      itemsOrdered[qtyOrdered] = dvd;
	        //    qtyOrdered++;
	          //  System.out.println("The disc " + dvd.getTitle() + " has been added.");
	            //if (qtyOrdered == MAX_NUMBERS_ORDERED) {
	              //  System.out.println("The cart is almost full.");
	        //    }
	//        } else {
	//            System.out.println("Cannot add more items. The cart is full.");
	//            break;
	//        }
	//    }
//	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        addDigitalVideoDisc(dvd1); // Reuse the single-disc method
	    }
	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        addDigitalVideoDisc(dvd2); // Reuse the single-disc method
	    }
	}

	public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return;
			}	
			
	    }
		System.out.println("The disc is not found in the cart");
	}
	
	public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
	}
	
	public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double totalCost = 0.0;
        int count = 1;

        for (DigitalVideoDisc dvd : itemsOrdered) {
        	if (dvd != null) {
                System.out.println(count + ". " + dvd.toString());
                totalCost += dvd.getCost();
                count++;
        	}
        }

        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                System.out.println("Found: " + dvd.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.isMatch(title)) {
                System.out.println("Found: " + dvd.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No DVD found with title: \"" + title + "\"");
        }
    }
	}
