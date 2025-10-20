import java.util.ArrayList;

public class Bike {
    private ArrayList<Parts> parts;
    private String name;
    private double price;
    private int weight;
    private int topSpeed;
    private int speed = 0;

    public Bike(String name, double price, int topSpeed, int speed) {
        this.parts = new ArrayList<Parts>();
        this.name = name;
        this.price = price;
        this.topSpeed = topSpeed;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed ++;
    }

    public void brake() {
        this.speed --;
    }

    public void addPart(Parts part) {
        this.parts.add(part);
    }

    public void displayParts() {
        System.out.println(this.parts);
    }

}
