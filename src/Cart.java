
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] arrayIteam = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int numberDisc = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (numberDisc < MAX_NUMBERS_ORDERED) {
            arrayIteam[numberDisc] = disc;
            numberDisc++;
            System.out.println("+1");
        } else {
            System.out.println("Full 20");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < numberDisc; i++) {
            if (arrayIteam[i] == disc) {
                for (int j = i; j < numberDisc - 1; j++) {
                    arrayIteam[j] = arrayIteam[j + 1];
                }
                arrayIteam[numberDisc - 1] = null;
                numberDisc--;
                System.out.println("-1");
                return;
            }
        }
        System.out.println("404");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < numberDisc; i++) {
            total += arrayIteam[i].getCost();
        }
        return total;
    }
}