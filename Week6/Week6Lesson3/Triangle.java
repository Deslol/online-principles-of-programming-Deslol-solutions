import java.util.ArrayList;
public class Triangle extends Shape {
    public Triangle(ArrayList<Integer> edges){
        super(edges);
    }

    @Override
    public String toString(){
        String toReturn = "This Triangle has the edges, ";
        for(Integer i : edges){
            toReturn += i + ", ";
        }
        return toReturn;
    }
}