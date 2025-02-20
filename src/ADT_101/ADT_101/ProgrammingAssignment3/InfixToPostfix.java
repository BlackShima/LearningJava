package ProgrammingAssignment3;
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
        // Simple validation for paired parentheses and correct characters
        int openBrackets = 0;
        for (char c : expression.toCharArray()) {
            if (c == '(') openBrackets++;
            if (c == ')') openBrackets--;
            if (!Character.isLetterOrDigit(c) && !isOperator(c) && c != '(' && c != ')') {
                return false;
            }
            if (openBrackets < 0) return false;
        }
        return openBrackets == 0;
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
        if (args.length != 1) {
            System.out.println("Please provide input file (input1.txt) as command line argument.");
            return;
        }
        
        // Example input and validation
        String[] expressions = {
            "a-b/(c+d-e)*(f*g*h+i)",
            "1+2+3^4**"
        };

        for (String exp : expressions) {
            System.out.println("Infix exp: " + exp);
            if (isValidInfix(exp)) {
                System.out.println("Valid");
                System.out.println("Postfix exp: " + infixToPostfix(exp));
            } else {
                System.out.println("Not-Valid");
            }
        }
    }
}
