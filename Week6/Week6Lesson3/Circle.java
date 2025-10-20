import java.util.ArrayList;

public class Circle extends Shape{
    private double circumference;
    private double radius;

    public Circle(double radius, double circumference ) {
        super(new ArrayList<>());
        this.radius = radius;
        this.circumference = circumference;
    }

    @Override
    public String toString(){
        String toReturn = "This Circle has the radius, ";
        toReturn += this.radius;
        toReturn += "and circumference of";
        toReturn += this.circumference;
        return toReturn;
    }
}