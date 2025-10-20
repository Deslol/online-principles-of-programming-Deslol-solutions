import java.util.ArrayList;

public class Parts {
    private double cost;
    private int weight;
    private String brand;

    public Parts (double cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public void getCost() {
        System.out.println(this.cost);
    }

    public void getBrand(){
        System.out.println(this.brand);
    }

    public void getWeight() {
        System.out.println(this.weight);
    }
}
