#include <stdio.h>
#include <math.h>

/*
 * Using the math.h library (imported already), 
 * 
 * 1. Complete the pow3 function below so that takes as an argument a double and 
 * returns that value raised to the power of 3 
 * (hint use the pow function in the math library)
 *
 * 2. Create a function that takes as an argument a double and return the natural log 
 * of that value.  
 *
 * Demonstrate your functions by calling them the main function and printing out the
 * values returned 
*/

double pow3(double value){
  return pow(value, 3);
}

double logValue(double value) {
  return log(value);
}

int main(void) {
  printf("The power 3 of the value %d, is %.2f and the natural log of value %d, is %.2f\n", 3, pow3(3), 12, logValue(12));
  return 0;
}