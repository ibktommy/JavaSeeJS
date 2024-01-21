// Write a program that performs basic arithmetic operations of two numbers

function basicArithmetic(firstNum, secondNum) {
  // Declare Variables
  let addition, subtraction, division, multiplication;

  // Initialize variables with the appropriate operations
  addition = firstNum + secondNum;
  subtraction = firstNum - secondNum;
  division = firstNum / secondNum;
  multiplication = firstNum * secondNum;

  // Return Outputs
  return (
    `${firstNum} + ${secondNum} = ${addition} \n` + 
    `${firstNum} - ${secondNum} = ${subtraction} \n` +
    `${firstNum} / ${secondNum} = ${division} \n` +
    `${firstNum} * ${secondNum} = ${multiplication}`
  )
}

console.log(basicArithmetic(2, 10));










