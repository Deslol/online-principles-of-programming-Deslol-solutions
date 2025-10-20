public class Wheel extends Parts {
    private String model;
    private String tyre;

    public Wheel(double cost, int weight) {
        super(cost, weight);
    }

    public void getModel(){
        System.out.println(this.model);
    }

    public void getTyre(){
        System.out.println(this.tyre);
    }
}
