This program reads infix expressions from a file named input1.csv in the same directory. It checks whether each expression is valid, and if valid, converts it to postfix notation. The program utilizes:

A Node class to represent nodes in a singly-linked list.

A LinkedStack class, which uses the Node class to implement stack functionality.

An infix-to-postfix converter that follows a standard algorithm using stack operations.

Table of Contents
Installation

Usage and Output

Features

Installation
Save the source code in a file named Program_Ass3.java and create an input1.csv file.

Ensure the input1.csv file contains student data in the correct format.

Run the Java program using a cross-platform code editor such as Visual Studio Code.

Usage and Output
To use the program, follow these steps:

Run the program in your terminal.

Example interaction:

Expression 1:

Infix exp: a-b/(c+d-e)*(f^g*h+i)
Valid
Postfix exp: abcd+e-/fg^h*i+*-
Expression 2:

Infix exp: 1+2+3^4**
Not-Valid
Features
Balanced Parentheses Checking: Uses a stack-based method to ensure each ( has a matching ).

Operator Checking: Detects invalid consecutive operators like ++, **, // (with special handling for ^ if needed).

Start/End Validation: Rejects expressions that start or end with disallowed operators.

Linked-List-Based Stack: Demonstrates how to create a custom data structure instead of using Java’s built-in Stack or ArrayList.

Handles Basic Operators: +, -, *, /, and ^ (power).

Automatic File Reading: Always attempts to open input1.csv (no command-line arguments needed).
