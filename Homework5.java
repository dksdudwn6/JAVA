public class Homework5 {
    public static void main(String[] args) {
        Computer c = new Computer("Core i7", "32GB", "2TB", "White", "700W");
        Monitor m = new Monitor("32 inch", "Black", "45W");
        PersonalComputer pc = new PersonalComputer(c, m);
        pc.turnOn();
        pc.printInfo();
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("  CPU: " + computer.getCpu());
        System.out.println("  Memory: " + computer.getMemory());
        System.out.println("  HDD: " + computer.getHd());
        System.out.println("  Color: " + computer.getColor());
        System.out.println("  Power: " + computer.getPower());
        System.out.println("The spec of the monitor");
        System.out.println("  Size: " + monitor.getSize());
        System.out.println("  Color: " + monitor.getColor());
        System.out.println("  Power: " + monitor.getPower());
    }
}

class Computer {
    private String cpu, memory, hd, color, power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu; this.memory = memory; this.hd = hd; this.color = color; this.power = power;
    }

    public void turnOn() { System.out.println("Turning on the computer."); }

    public String getCpu() { return cpu; }
    public String getMemory() { return memory; }
    public String getHd() { return hd; }
    public String getColor() { return color; }
    public String getPower() { return power; }
}

class Monitor {
    private String size, color, power;

    public Monitor(String size, String color, String power) {
        this.size = size; this.color = color; this.power = power;
    }

    public void turnOn() { System.out.println("Turning on the monitor."); }

    public String getSize() { return size; }
    public String getColor() { return color; }
    public String getPower() { return power; }
}

