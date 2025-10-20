import java.util.ArrayList;

/*
 * Implement different shapes by extending the Shape class.  For example,
 * implement a Triangle, Square and Circle.
 *
 * For each implementation, override the toString method to provide
 * a more specific description of the Shape.  For example, if you
 * implement a Circle you might return the String
 *
 * This Circle has a radius of 5 and a circumference of 31.42
 */


public class Square extends Shape {
    public Square(ArrayList<Integer> edges){
        super(edges);
    }

    @Override
    public String toString(){
        String toReturn = "This Square has the edges, ";
        for(Integer i : edges){
            toReturn += i + ", ";
        }
        return toReturn;
    }
}
