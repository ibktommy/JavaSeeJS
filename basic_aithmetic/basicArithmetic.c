// Write a program that performs basic arithmetic operations of two numbers

#include <stdio.h>

int main(void)
{
  // Declare variables
  float firstNum, secondNum;
  float addition, subtraction, division, multiplication;

  // Prompt user for inputs
  printf("Enter first number: ");
  scanf("%f", &firstNum);
  printf("Enter second number: ");
  scanf("%f", &secondNum);

  // Initialize variables with the appropriate operations
  addition = firstNum + secondNum;
  subtraction = firstNum - secondNum;
  division = firstNum / secondNum;
  multiplication = firstNum * secondNum;

  /* Print results to the screen for users */
  printf("%.2f + %.2f = %.2f \n", firstNum, secondNum, addition);
  printf("%.2f - %.2f = %.2f \n", firstNum, secondNum, subtraction);
  printf("%.2f / %.2f = %.2f \n", firstNum, secondNum, division);
  printf("%.2f * %.2f = %.2f", firstNum, secondNum, multiplication);

  return 0;
}





