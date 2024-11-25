public class CartTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Jungle Book", "Animation", "Jon Favreau", 118, 15.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fairy Tale", "Kenneth Branagh", 105, 12.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Jon Favreau", 118, 14.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladdin", "Fairy Tale", "Guy Ritchie", 128, 13.99f);

        Cart cart = new Cart();

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2, dvd3);
        cart.addDigitalVideoDisc(new DigitalVideoDisc[] {dvd4});

        cart.printCartDetails();

        System.out.println("Total cost of the cart: " + cart.totalCost() + " $");

        System.out.println("\nRemoving DVD: " + dvd2.getTitle());
        cart.removeDigitalVideoDisc(dvd2);
        cart.printCartDetails();


        System.out.println("\nSearching by ID:");
        cart.searchById(1);
        cart.searchById(10);

        System.out.println("\nSearching by Title:");
        cart.searchByTitle("The Jungle Book");
        cart.searchByTitle("The Matrix");

    }
}
