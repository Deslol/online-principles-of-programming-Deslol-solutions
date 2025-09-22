#include <math.h>
#include <stdbool.h>
#include <stdio.h>

/* 
 * Lab Sheet 2:
 */

/* Question 1: 
 
 Complete the function below which takes in an integer input between zero and one hundred (0 ≤ n ≤ 100) and prints out the number expressed in English text, with spaces and no dashes (–),
 e.g. for the number “33”, we would expect to see “thirty three”. Hint: you may want to create additional functions to help.
 
 Call this function from the main to test your program.
 */

void numberToText(int value) {
    switch (value) {
        case 0:
            printf("zero");
            break;
        case 1:
            printf("one");
            break;
        case 2:
            printf("two");
            break;
        case 3:
            printf("three");
            break;
        case 4:
            printf("four");
            break;
        case 5:
            printf("five");
            break;
        case 6:
            printf("six");
            break;
        case 7:
            printf("seven");
            break;
        case 8:
            printf("eight");
            break;
        case 9:
            printf("nine");
            break;
        case 10:
            printf("ten");
            break;
        case 11:
            printf("elevan");
            break;
        case 12:
            printf("twelve");

        case 100:
            printf("hundred");
            break;
        default:
            printf("This function only accept an integer input between zero and one hundred");
            break;
    }
}

/* Question 2: 
 
 Complete the function below that calculates, and returns, the distance between two points.
 
 Call this function from the main to test your program. Hint: may wish to use the following print statement in your main function, or similar: 

 printf("%1.2f\n", calculateDistance(0, 0, 4, 3));
 */

double calculateDistance(int x1, int y1, int x2, int y2) {
    return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
}

/* Question 3: 
 
 Complete the function below that is given an integer, n,
 where 1 ≤ n ≤ 9999 and prints whether it is even, odd, or/and prime.
 The output should be whole sentences for example,

 1 is odd and not prime.
 2 is even and prime.
 3 is odd and prime.
 4 is even and not prime.
 5 is odd and prime
 
 Call this function from the main to test your program.
 */

void printOddEvenAndOrPrime(int n) {
    bool isPrime = true;
    bool isEven;

    // First check the number is odd or even
    if (n % 2 == 0) { isEven = true; } else { isEven = false; }

    // Then check if it's prime
    int i = 2;
    if (n == 1) {
        isPrime = false;
    } else if (n > 1) {
        while (i <= sqrt(n)) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
    }
    printf("%d is %s and %s prime number\n ", n, isEven ? "even" : "odd", isPrime ? "a" : "not a");
}

int main(void) {
    printf("The distance is %.2f\n", calculateDistance(3, 3, 4, 4));
    printOddEvenAndOrPrime(101);
    return 0;
}
