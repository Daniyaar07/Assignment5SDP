# Assignment 5 - Strategy Pattern

### Baikanov Daniyar SE-2527
## Description
This is a simple calculator project using the Strategy Design Pattern in Java.

The calculator supports four operations:
- Addition
- Subtraction
- Multiplication
- Division

## How It Works

- OperationStrategy is the interface.
- AddStrategy performs addition.
- SubtractStrategy performs subtraction.
- MultiplyStrategy performs multiplication.
- DivideStrategy performs division.
- Calculator is the Context class.
- Main is the Client class.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open Main.java.
3. Click Run.

## Conclusion

The Strategy Pattern makes the calculator flexible.
Each operation has its own class.
We can add new operations without changing the Calculator class.