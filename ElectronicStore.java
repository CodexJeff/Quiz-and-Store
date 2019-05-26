public class ElectronicStore {
    private Desktop[] desktop = new Desktop[3];
    private Laptop[] laptop = new Laptop[3];
    private Fridge[] fridge = new Fridge[3];

    public ElectronicStore() {

        desktop[0] = new Desktop(3.5, 8, 500, false);
        desktop[1] = new Desktop(3.0, 16, 250, true);
        desktop[2] = new Desktop(4.3, 32, 500, true);

        laptop[0] = new Laptop(3.1, 32, 500, true, 15);
        laptop[1] = new Laptop(2.5, 8, 250, false, 13);
        laptop[2] = new Laptop(3.0, 16, 250, true, 15);

        fridge[0] = new Fridge(16.5, true, "Black");
        fridge[1] = new Fridge(12.0, false, "White");
        fridge[2] = new Fridge(23.0, true,"Stainless Steel");
    }

    public void printStock() {

        System.out.println(desktop[0]);
        System.out.println(desktop[1]);
        System.out.println(desktop[2]);

        System.out.println(laptop[0]);
        System.out.println(laptop[1]);
        System.out.println(laptop[2]);

        System.out.println(fridge[0]);
        System.out.println(fridge[1]);
        System.out.println(fridge[2]);
    }
}
