public class Frame extends Parts{
    private String material;
    private String model;
    private String description;

    public Frame ( String brand, String material, String model, double cost, int weight) {
        super(cost, weight);
        this.model = model;
        this.material = material;
    }

    public void getMaterial(){
        System.out.println(this.material);
    }

    public void getModel(){
        System.out.println(this.model);
    }
}
