#include <stdio.h>

void printHelloWorld(int input);

void printXTenTimes(int input);

void convertMetricToImperialHeights(int input);

void fibonacci(void);

void volumeOfACylinder(double height, double radius);

int main(void) {
    printf("Question 1\n");
    printHelloWorld(3);

    printf("\nQuestion 2\n");
    printXTenTimes(20);

    printf("\nQuestion 3\n");
    convertMetricToImperialHeights(183);

    printf("\nQuestion 4\n");
    fibonacci();

    printf("\nQuestion 5\n");
    volumeOfACylinder(7, 4);
    return 0;
}

/* 
 * Lab Sheet 1:
 */

/* Question 1: 

Adapt the “HelloWorld” code below to produce a program that defines a variable capable of holding an integer of your choice.
The program should add 3 to that number, multiply the result by 2, subtract 4, subtract twice the original number, add 3, then print the result and a new line.
*/

void printHelloWorld(int input) {
    int firstChange = input + 3;
    int secondChange = firstChange * 2;
    int thirdChange = secondChange - 4;
    int fourthChange = thirdChange - input - input;
    int fifthChange = fourthChange + 3;
    printf("Final result: %d\n", fifthChange);
}

/* Question 2: 

Complete the function below so that it prints every integer from x to x + 10.  Do not use loops. 

Call this function from the main to test your program.
*/

void printXTenTimes(int input) {
    int a = input;
    int b = input + 1;
    int c = input + 2;
    int d = input + 3;
    int e = input + 4;
    int f = input + 5;
    int g = input + 6;
    int h = input + 7;
    int i = input + 8;
    int j = input + 9;
    int k = input + 10;
    printf("1.%d\n2.%d\n3.%d\n4.%d\n5.%d\n6.%d\n7.%d\n8.%d\n9.%d\n10.%d\n11.%d\n", a, b, c, d, e, f, g, h, i, j, k);
}

/* Question 3: 

Complete the function below so that it converts the height of a person from centimetres to feet and inches.

Use integer division (rounding down is acceptable, which is the default for integer division).

Hint: 254 cm is exactly 100 inches and 12 inches is exactly 1 foot. 

Call this function from the main to test your program.  For example you could test your program with the follow five values, where "?" replaced with the true value.

101 cm is 3 feet 3 inches to the nearest inch.
3 cm is 0 feet 1 inches to the nearest inch.
15 cm is ? feet ? inches to the nearest inch.
192 cm is ? feet ? inches to the nearest inch.
124 cm is ? feet ? inches to the nearest inch.
*/

void convertMetricToImperialHeights(int input) {
    int totalInches = input / 2.54;
    int feet = totalInches / 12;
    int inches = totalInches % 12;
    printf("%d is %d foot %d inches to the nearest inch.\n", input, feet, inches);
}

/* Question 4: 

Complete the function below so that it uses three variables (current, previous, next) to calculate and print out the first ten numbers of the Fibonacci sequence,
each on a new line: i.e. the first four lines should be as follows:

0 
1 
1 
2

Call this function from the main to test your program.
*/

void fibonacci(void) {
    int previous = 0, current = 1, next;
    printf("%d\n%d\n", previous, current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
    next = previous + current;
    previous = current;
    current = next;
    printf("%d\n", current);
}

/* Question 5: 

Complete the function below so that it uses two variables: height and radius. Use these two variables and print to the screen, the volume of a cylinder. 

Call this function from the main to test your program.  For example, you could test your program with the following values, 

height 7.0cm and radius 4.0cm
height 20.0cm and radius 3.0cm
height 14.7cm and radius 5.2cm

Which print out, the cylinder with height 7.0cm and radius 4.0cm has a volume of 351.86cm^3

*/

void volumeOfACylinder(double height, double radius) {
    double pi = 3.14159265359;
    double volumn = pi * radius * radius * height;
    printf("The cylinder with height %fcm and radius %fcm has a volumn of %fcm^3", height, radius, volumn);
}
