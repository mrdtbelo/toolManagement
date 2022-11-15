public class DrillingMachine {

    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.name = "Driller";
        this.watt = (int) (800 + (Math.random() * 1200));
        this.age = (int) (Math.random() * 10);
        this.price = ( 50+ (Math.random() * 500));
        this.broken = false;
    }

    public int getWatt() {
        return watt; }
    public void setWatt(int watt) {
        this.watt = watt;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBroken() {
        return broken;
    }
    public void setBroken(boolean broken) {
        this.broken = broken;
    }


    public void becomeBroken() {
        setBroken(true);
    }

    public void repair() {
        if (isBroken() == true){
                setBroken(false);
                setPrice(getPrice()/ 2);
        }
    }
    public void aging() {
        setAge(getAge() + 1 );
        if (getAge() >= 10){
            setBroken(true);
        }
    }

    public void reactOnHighDemand(){
        setPrice(getPrice() + getPrice()*1.25);
    }
}
