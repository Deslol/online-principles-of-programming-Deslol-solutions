#include <stdio.h>

/* Create a function that contains a local variable n. Initialise this variable
 * to 100 and print to the screen the value of n*n.
 *
 * Modify your code so that you can print out the result of this calculation
 * in the main function. Do this both via a return in the function you have
 * defined and by using a global variable.
 */


// 1
void hundredTimesN() {
    int n = 100;
    printf("%d\n", n * n);
}

// 2

int hundredTimesNResult() {
    int n = 100;
    return n * n;
}

// 3

int global_n = 100;

int globalHundredTimesN() {
    return global_n * global_n;
}

int main(void) {
    hundredTimesN();
    printf("print the result in main function %d\n", hundredTimesNResult());
    printf("print the result in main function using global variable %d\n", globalHundredTimesN());
    return 0;
}
