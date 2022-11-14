public class MainProgram {

    public static void main(String[] args) {

        DrillingMachine d1 = new DrillingMachine();
        System.out.println(d1.getName() +"   "+ d1.getWatt() +"   "+ d1.getAge() +"   "+ d1.getPrice() +"   "+ d1.isBroken());

        DrillingMachine d2 = new DrillingMachine();
        System.out.println(d2.getName() +"   "+ d2.getWatt() +"   "+ d2.getAge() +"   "+ d2.getPrice() +"   "+ d2.isBroken());

        DrillingMachine d3 = new DrillingMachine();
        System.out.println(d3.getName() +"   "+ d3.getWatt() +"   "+ d3.getAge() +"   "+ d3.getPrice() +"   "+ d3.isBroken());
    }
}
