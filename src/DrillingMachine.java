public class DrillingMachine {

    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.name = "drillingMachine";
        this.watt = (int) (800 + Math.random() * 1200);

    }
}
