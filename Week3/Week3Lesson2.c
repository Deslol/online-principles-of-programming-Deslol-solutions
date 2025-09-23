#include <stdio.h>

/* Modify the function below so that it populates the array evenNumbers with
 * calculated value rather than printing it out.  
 * 
 * Now create a function that prints out this evenNumbers array and call it from
 * the main function
 */

int evenNumbersSize = 10;
int evenNumbers[10];

void populateArray() {
    for (int i = 0; i < evenNumbersSize; i++) {
        evenNumbers[i] = (i + 1) * 2;
    }
}

void printArray(int myArr[], int size) {
    for (int i = 0; i < size; i++) {
        if (i == 0) {
            printf("[%d,", myArr[i]);
        } else if (i == size - 1) {
            printf("%d]\n", myArr[i]);
        } else {
            printf("%d,", myArr[i]);
        }
    }
}

char hello[20];
char greeting2[6] = "hello";
void randomFunc() {
    printf("Alan sex cam master");
}

int main(void) {
    populateArray();
    printArray(evenNumbers, 10);
    greeting2[1] = 'o';
    greeting2[2] = 'w';
    greeting2[3] = 'd';
    greeting2[4] = 'y';
    printf("String: %s\n", greeting2);
    randomFunc();
    return 0;
}