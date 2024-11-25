public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int numberOfDVDs;

    public Store() {
        this.itemsInStore = new DigitalVideoDisc[20];
        this.numberOfDVDs = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (numberOfDVDs < 20) {
            itemsInStore[numberOfDVDs] = dvd;
            numberOfDVDs++;
            System.out.println("DVD '" + dvd.getTitle() + "' has been added to the store.");
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < numberOfDVDs; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < numberOfDVDs - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numberOfDVDs - 1] = null;
                numberOfDVDs--;
                System.out.println("DVD '" + dvd.getTitle() + "' has been removed from the store.");
                return;
            }
        }
        System.out.println("DVD not found.");
    }

    public void displayStoreItems() {
        if (numberOfDVDs == 0) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("********** Store Inventory **********");
            for (int i = 0; i < numberOfDVDs; i++) {
                DigitalVideoDisc dvd = itemsInStore[i];
                System.out.println((i + 1) + ". DVD - " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + " mins: " + dvd.getCost() + " $");
            }
            System.out.println("************************************");
        }
    }
}
