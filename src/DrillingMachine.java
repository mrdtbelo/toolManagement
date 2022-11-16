public class DrillingMachine {

    // (210) Aufgabe 1
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.name = "Driller";
        this.watt = (int) (Math.random() * 1201 + 800);
        this.age = (int) (Math.random() * 11);
        this.price = Math.random() * 450 + 50;
        this.broken = false;
    }

    // (210) Aufgabe 2
    public void becomeBroken() {
        broken = true;
    }

    public void repair() {
        if (broken == true) {
            broken = false;
            price = price / 2;
        }
    }

    public void aging() {
        age = age + 1;
        if (age >= 10) {
            becomeBroken();
        }
    }

    public void reactOnHighDemand() {
        price = price * 1.25;
    }

    // (210) Aufgabe 3
    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public void increasePrice(double amount) {
        price = price + amount;
    }

    public void changePower(int watt) {
        if (watt > 0) {
            this.watt = this.watt + watt;
            if (watt > 100) {
                this.price = price * 1.05;
            }
        } else if (watt < 0) {
            this.watt = this.watt + watt;
            this.price = price * 0.9;
        }
    }

    //(210) Aufgabe 4
    public double getPrice(){
        return price;
    }

    public boolean isInexpensive() {
        if (watt > 500 && price < 80) {
            System.out.println("preiswert!!");
            return true;
        } else {
            System.out.println("nicht  preiswert!!");
            return false;
        }
    }

    // (210) Aufgabe 5
    public boolean increasePriceByPercentage(double percentage){
        if(price > 0.0){
            price = price + percentage;
            if(price > 100){
                return true;
            }
        }
        return false;
    }

    public boolean repair2(){
        if(broken == true){
            repair();
            return true;
        }
        return false;
    }

    public String getInfo(){
        return "Kaufen Sie den " + name + " der " + age + " Jahre alt ist. " +
                "Die Leistung mit " + watt + " kostet auch nur " + price + " Euro. Greifen sie zu"  ;
    }
}

