// Vulnerable C code snippet
#include <stdio.h>
#include <string.h>

void vulnerableFunction(char *input) {
    char buffer[10];
    strcpy(buffer, input);
    printf("%s\n", buffer);
}

int main() {
    char userInput[100];
    printf("Enter your input: ");
    fgets(userInput, sizeof(userInput), stdin);
    vulnerableFunction(userInput);
    return 0;
}
