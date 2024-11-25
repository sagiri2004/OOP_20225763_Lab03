public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Jungle Book", "Animation", "Jon Favreau", 118, 15.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fairy Tale", "Kenneth Branagh", 105, 12.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Jon Favreau", 118, 14.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladdin", "Fairy Tale", "Guy Ritchie", 128, 13.99f);

        Store store = new Store();

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);

        store.displayStoreItems();
        store.removeDVD(dvd2);
        store.displayStoreItems();

        DigitalVideoDisc dvdNotInStore = new DigitalVideoDisc("Mulan", "Fairy Tale", "Tony Bancroft", 88, 11.99f);
        store.removeDVD(dvdNotInStore);
    }
}
