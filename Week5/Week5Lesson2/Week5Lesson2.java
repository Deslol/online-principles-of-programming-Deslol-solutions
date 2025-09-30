
/*
 * Implement the methods below.
 * Then create a new instance of the Week5Lesson2 class and test your methods.
 * (Hint: If you're not sure how to create an instance of the class, look at the main method in the previous exercise)
 */

public class Week5Lesson2 {
    public static void main(String[] args) {
        Week5Lesson2 w5l2 = new Week5Lesson2();
        System.out.println(w5l2.isModThree(98));
        System.out.println(w5l2.multiply(2,10));
        System.out.println(w5l2.fib(4));

    }

    // Method which returns true if a number is divisible by 3 and
    // false if it is not.  Hint: use the modulo (%) operator.
    public boolean isModThree(int n) {
        return n % 3 == 0;
    }

    // Recursive method which performs multiplication of two
    // numbers without using the inbuilt * sign
    public int multiply(int n, int by) {
        int sum = 0;
        while (by > 0){
            by--;
            sum += n;
        }
        return sum;
    }

    /*
     * Complete the fibonacci method below such that it calculates the
     * nth term of the Fibonacci sequence using iteration.
     *
     * The first 4 terms of the Fibonacci sequence in this example
     * are  1, 1, 2, 3
     *
     * For example if we call fibonacci(1) we should get the value 1 returned,
     * if we call fibonacci(4) we should get the value 3 returned.
     */
    public int fib(int term) {
        if(term == 1 || term == 2) return 1;

        int cur = 1;
        int prev = 1;
        int next = cur + prev;
        while(term > 2){
            prev = cur;
            cur = next;
            next = cur + prev;
            term--;
        }
        return cur;
    }
}
