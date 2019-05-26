public class Laptop {
    private double cpu; //in ghz
    private int ram, storage, size; //in GB, inches
    private boolean ssd; //true or false

    public Laptop (double theCpu, int theRam, int theStorage, boolean theSSD, int theSize) {
        cpu = theCpu;
        ram = theRam;
        storage = theStorage;
        ssd = theSSD;
        size = theSize;
    }

    public String toString() {
        if (!ssd) {
            return size + "\' Laptop PC with " + cpu + " CPU, " + ram + "GB RAM, " + storage + "GB HDD drive.";
        }
        return size + "\' Laptop PC with " + cpu + " CPU, " + ram + "GB RAM, " + storage + "GB SSD drive.";
    }
}

