
public class DigitalVideoDisc {
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = "";
        this.length = 0;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public static int nbDigitalVideoDiscs = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    public static int getTotalDVDs() {
        return nbDigitalVideoDiscs;
    }
}