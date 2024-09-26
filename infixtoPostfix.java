import java.util.Scanner;
import java.util.Stack;

class Postfix {
    public static Stack<Character> myStack = new Stack<>();
    public static StringBuilder result = new StringBuilder();

    public static String convertToPostfix(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                myStack.push(ch);
            } else if (ch == ')') {
                while (!myStack.isEmpty() && myStack.peek() != '(') {
                    result.append(myStack.pop());
                }
                myStack.pop(); 
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!myStack.isEmpty() && precedence(myStack.peek()) >= precedence(ch)) {
                    result.append(myStack.pop());
                }
                myStack.push(ch);
            }
        }

        while (!myStack.isEmpty()) {
            result.append(myStack.pop());
        }

        return result.toString();
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}

public class    infixtoPostfix {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your infix data");
String infixNotation=scanner.nextLine();
     

        String postFixNotation = Postfix.convertToPostfix(infixNotation);
        System.out.println(postFixNotation + " is the postfix notation.");
    }
}
