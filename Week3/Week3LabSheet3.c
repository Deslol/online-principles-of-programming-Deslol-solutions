#include <stdio.h>

  /* 
  * Lab Sheet 3
  */

  /* Question 1
  
  Complete the function below which converts a hexadecimal string into its decimal value. (Do not use a C standard library function.) 

  The main function calls this function with an example hexadecimal value. Change this value to test your program.
  */

int hexToDec(char hex[]){
  return 22;
}

/* Question 2
 Complete the function below that print out a tree shape such as the following: 

    *
   ***
  *****
 *******
*********
   ***
   ***
   ***
   ***

  Note you can (and probably should) implement additional functions to help.

  You can assume that the width of the tree will be odd and hence every line will have an odd number of asterisks. The trunk will always have a width of three.

  Call this function from the main to test your program.
*/

void printTree(int width, int trunkLength){
  
}

int main(void) {
  char hex[4] = "FF3";
  printf("The hex value %s is %d in decimal\n", hex, hexToDec(hex));
  return 0;
}