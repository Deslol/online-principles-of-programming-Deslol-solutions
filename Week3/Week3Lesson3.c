#include <stdio.h>

/*
 * Modify the function below so that it prints out each character in the string
 * on a new line.  Hint: the end of a string is signified by the '\0' char
 */

void printCharsInString(char string[]){
  printf("%s\n", string);
}

int main(void) {
  char my_string[] = "This is a string";
  printCharsInString(my_string);
  return 0;
}