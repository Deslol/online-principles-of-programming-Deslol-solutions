
public class MyMath {

    public static final double PI = 3.14;

    // addition
    public static int add(int x, int y) {
        return x + y;
    }

    // subtraction
    public static int sub(int x, int y) {
        return x - y;
    }

    // multiplication
    public static int mult(int x, int y) {
        return x * y;
    }

    // division
    public static int div(int x, int y) {
        return x / y;
    }

    // raise x to the power y: x^y
    public static double pow(int x, int y) {
        double accumulator = 1;
        int factor = y > 0 ? y : -y;

        for (int i = 0; i < factor; i++) {
            accumulator = accumulator * x;
        }

        if (y < 0) {
            accumulator = 1.0 / accumulator;
        }

        return accumulator;
    }

    // square root
    public static double sqrt(int x) {
        return Math.sqrt(x);
    }

}