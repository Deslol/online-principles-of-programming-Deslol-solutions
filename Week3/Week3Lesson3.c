#include <stdbool.h>
#include <stdio.h>
#include <string.h>

/*
 * Modify the function below so that it prints out each character in the string
 * on a new line.  Hint: the end of a string is signified by the '\0' char
 */

void printCharsInString(char input[]) {
    int i = 0;
    while (true) {
        char string = input[i];
        if (string == 0) break;
        printf("%c\n", string);
        i++;
    }
}

int main(void) {
    char my_string[] = "This is a string";
    printCharsInString(my_string);
    char str[10];
    strcpy(str, "fuck alan");
    printf("%s\n", str);
    return 0;
}