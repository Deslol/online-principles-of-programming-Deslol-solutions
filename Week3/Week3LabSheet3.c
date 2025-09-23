#include <stdio.h>
#include <string.h>
#include <math.h>

/*
* Lab Sheet 3
*/

/* Question 1

Complete the function below which converts a hexadecimal string into its decimal value. (Do not use a C standard library function.)

The main function calls this function with an example hexadecimal value. Change this value to test your program.
*/

int hexToDec(char hex[]) {
    double decValue = 0;
    // omit first 2 entries; always 0x
    for (int i = hex[0] == '0' && hex[1] == 'x' ? 2 : 0; i < strlen(hex); i++) {
        int value = 0;
        switch (hex[i]) {
            case '0':
                value = 0;
                break;
            case '1':
                value = 1;
                break;
            case '2':
                value = 2;
                break;
            case '3':
                value = 3;
                break;
            case '4':
                value = 4;
                break;
            case '5':
                value = 5;
                break;
            case '6':
                value = 6;
                break;
            case '7':
                value = 7;
                break;
            case '8':
                value = 8;
                break;
            case '9':
                value = 9;
                break;
            case 'A':
            case 'a':
                value = 10;
                break;
            case 'B':
            case 'b':
                value = 11;
                break;
            case 'C':
            case 'c':
                value = 12;
                break;
            case 'D':
            case 'd':
                value = 13;
                break;
            case 'E':
            case 'e':
                value = 14;
                break;
            case 'F':
            case 'f':
                value = 15;
                break;
            default:
                return printf("entry out of range");
        }
        printf("i:%d, current value: %d, hex[i]: %c\n", i, value, hex[i]);
        decValue += value * pow(16, strlen(hex) - i - 1);
        printf("decimal Value: %f\n", decValue);
    }

    return decValue;
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

void printTree(int width, int trunkLength) {
}

int main(void) {
    char hex[4] = "FF3";
    char testHex[6] = "0xAF3";
    printf("The hex value %s is %d in decimal\n", hex, hexToDec(hex));
    printf("The hex value %s is %d in decimal\n", testHex, hexToDec(testHex));
    return 0;
}
