package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] arrayItem = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int numberDisc = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (numberDisc < MAX_NUMBERS_ORDERED) {
            arrayItem[numberDisc] = disc;
            numberDisc++;
            System.out.println("+1 DVD added");
        } else {
            System.out.println("The cart is full (Max 20 DVDs).");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            addDigitalVideoDisc(dvdList[i]);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < numberDisc; i++) {
            if (arrayItem[i] == disc) {
                for (int j = i; j < numberDisc - 1; j++) {
                    arrayItem[j] = arrayItem[j + 1];
                }
                arrayItem[numberDisc - 1] = null;
                numberDisc--;
                System.out.println("-1 DVD removed");
                return;
            }
        }
        System.out.println("DVD not found (404)");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < numberDisc; i++) {
            total += arrayItem[i].getCost();
        }
        return total;
    }

    public void printCartDetails() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int index = 1;
        for (int i = 0; i < numberDisc; i++) {
            System.out.println(index + ". " + arrayItem[i].toString());
            index++;
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < numberDisc; i++) {
            if (arrayItem[i].isMatch(title)) {
                System.out.println("Found DVD: " + arrayItem[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }

    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < numberDisc; i++) {
            if (arrayItem[i].getId() == id) {
                System.out.println("Found DVD: " + arrayItem[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

}
