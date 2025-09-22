#include <stdio.h>
#include <stdbool.h>

/*
 * Write a function which returns true if a number is divisible by 3 and  
 * false if it is not.  Hint: use the modulo (%) operator.
 *
 * Modify your code so that your function now returns true if a number is divisible 
 * by 3 or 5 and false if it is not.
 *
*/

// 1

bool numberIsDivisibleBy3(int num) {
    return num % 3 == 0;
}

// 2

bool numberIsDivisibleBy3Or5(int num) {
    return num % 3 == 0 || num % 5 == 0;
}

int main(void) {
    // true
    printf("Number is divisible by 3?, %s\n", numberIsDivisibleBy3(6) ? "Yes" : "No");
    printf("Number is divisible by 3?, %s\n", numberIsDivisibleBy3Or5(30) ? "Yes" : "No");
    // false
    printf("Number is divisible by 3 or 5?, %s\n", numberIsDivisibleBy3(5) ? "Yes" : "No");
    printf("Number is divisible by 3 or 5?, %s\n", numberIsDivisibleBy3(10) ? "Yes" : "No");

    return 0;
}
