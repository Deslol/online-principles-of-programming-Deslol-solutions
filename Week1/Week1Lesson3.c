#include <stdio.h>

/* 
 * In the code below,
 * 
 * 1. change the value stored in n to 24
 *
 * Now, using the printf function in the stdio.h library (imported above),
 * 
 * 2. print out the value of n 
 * 3. change the value of n to 4 and in a new variable, 
 * store the value of n multiplied by 3 and print it out
 *
*/

int main(void) {
  int n = 24;
  printf("Hello World\n");
    printf("%d\n", n);
  n = 4;
  int m = n*3;
  printf("%d\n", m);
  return 0;
}