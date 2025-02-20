package ProgrammingAssignment3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class InfixToPostfix {
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean isValidInfix(String expression) {
        int openBrackets = 0;
        char prevChar = ' '; // Track previous character
    
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else if (c == ')') {
                openBrackets--;
                if (openBrackets < 0) return false; // More closing than opening
            } else if (Character.isDigit(c)) { 
                // Allow numbers (fixing issue with numeric expressions)
            } else if (isOperator(c)) {
                // Ensure two operators don't appear consecutively (like "**" or "++")
                if (prevChar != ' ' && isOperator(prevChar)) {
                    return false;
                }
            } else if (c != ' ') { 
                // Invalid character detected (not number, operator, or parentheses)
                return false;
            }
            prevChar = c;
        }
        return openBrackets == 0; // Ensure all parentheses are balanced
    }
    

    public static String infixToPostfix(String expression) {
        LinkedListStack stack = new LinkedListStack();
        StringBuilder result = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // pop '('
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
    String filename = (args.length > 0) ? args[0] : "C:/Users/Black/test/adt/src/ADT_101/ADT_101/ProgrammingAssignment3/input1.csv"; // Use default if no argument

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String expression;
        while ((expression = reader.readLine()) != null) {
            System.out.println("Infix Expression: " + expression);
            if (isValidInfix(expression)) {
                System.out.println("Valid");
                System.out.println("Postfix Expression: " + infixToPostfix(expression));
            } else {
                System.out.println("Not Valid");
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
}

}
