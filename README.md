# Java Console Calculator

A simple, modular command-line calculator written in Java. This project demonstrates basic object-oriented programming concepts by separating each arithmetic operation into its own dedicated class.

## Features

* **Basic Arithmetic Operations:** Supports Addition, Subtraction, Multiplication, and Division using floating-point (`double`) precision.
* **Modular Architecture:** Separates calculation logic into individual utility classes (`sum`, `diff`, `prod`, and `qou`).
* **Error Handling:** Prevents crashes by checking for division by zero and catching invalid menu selections.
* **Interactive CLI:** Clean console interface using `java.util.Scanner` for user input.

## Project Structure

```text
com/mycompany/calculator/
├── Calculator.java   # Main entry point, user menu, and input/output handling
├── sum.java          # Handles addition
├── diff.java         # Handles subtraction
├── prod.java         # Handles multiplication
└── qou.java          # Handles division
