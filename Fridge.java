public class Fridge {
    private double size; //in cubic feet
    private boolean freezer; //true or false
    private String color;

    public Fridge (double theSize, boolean theFreezer, String theColor) {
        size = theSize;
        freezer = theFreezer;
        color = theColor;
    }

    public String toString() {
        if (!freezer) {
            return size + " cubic foot Fridge (" + color + ")";
        }
        return size + " cubic foot Fridge with Freezer (" + color + ")";
    }
}