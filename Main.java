import java.util.*;
import java.util.Stack;
public class Main {
    static int evaluatepostfix(char[] notation) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < notation.length; i++) {
            char c = notation[i];
            if (c >= '0' && c <= '9') {
                int temp = (int) (c - '0');
                stack.push(temp);
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(op2 + op1);
                        break;
                    case '-':
                        stack.push(op2 - op1);
                        break;
                    case '*':
                        stack.push(op2 * op1);
                        break;    
                    case '/':
                        stack.push(op2 / op1);
                        break;
                }
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println("Enter your postfix notation:");
        Scanner scanner=new Scanner(System.in);
        String notation = scanner.nextLine();
        System.out.println(evaluatepostfix(notation.toCharArray()));
    }
}
