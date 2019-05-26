public class Desktop {
    private double cpu; //in ghz
    private int ram, storage; //in GB
    private boolean ssd; //true or false

    public Desktop(double theCpu, int theRam, int theStorage, boolean theSSD) {
        cpu = theCpu;
        ram = theRam;
        storage = theStorage;
        ssd = theSSD;
    }

    public String toString() {
        if (!ssd) {
            return "Desktop PC with " + cpu + " CPU, " + ram + "GB RAM, " + storage + "GB HDD drive.";
        }
        return "Desktop PC with " + cpu + " CPU, " + ram + "GB RAM, " + storage + "GB SSD drive.";
    }
}
