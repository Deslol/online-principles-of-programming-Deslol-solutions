#include <stdio.h>

/* 
 Modify the function below so that it prints out the square multiplication tables for any number.
 How might you modify this function, or add a new function, so it prints out the multiplication tables for any range of numbers?

 */

// 1
void squareMultTable(int n) {
    for (int i = 1; i < n + 1; i++) {
        printf("%d\t", i * n);
    }
    printf("\n");
}

void modSquareMultTable(int n, int length) {
    /* Desired output:
    * 1 2 3 4 5 6 ... n
    * 2 4 6 8 10 12 ... 2n
    * x . . . . . . . ... xn
    * what will be required? the length, the number
    */
    for (int i = 1; i < length + 1; i++) {
        printf("%d\t", i * n);
    }
    printf("\n");
}

int main(void) {
    squareMultTable(10);
    modSquareMultTable(100, 100);
    return 0;
}
