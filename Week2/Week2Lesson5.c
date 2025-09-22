#include <stdio.h>
/*
 * Complete the fibonacci function below such that it calculates the
 * nth term of the Fibonacci sequence using iteration.
 *
 * The first 4 terms of the Fibonacci sequence in this example
 * are  1, 1, 2, 3
 *
 * For example if we call fibonacci(1) we should get the value 1 returned,
 * if we call fibonacci(4) we should get the value 3 returned.
 */
int fibonacci(int term) {
    int prev = 0, curr = 1, next, n;
    if (term == 0 || term == 1) return 1;

    for (n = 2; n <= term; n++) {
        next = curr + prev;
        prev = curr;
        curr = next;
    }

    return curr;
}

int main(void) {
    printf("%d\n", fibonacci(10));
    return 0;
}
