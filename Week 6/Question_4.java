import java.util.Stack;

public class Question_4 {
    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            throw new IllegalArgumentException("Invalid input tokens");
        }

        String operators = "+-*/";
        Stack<String> stack = new Stack<>();

        for (String t : tokens) {
            if (!operators.contains(t)) { // push to stack if it is a number
                stack.push(t);
            } else { // pop numbers from stack if it is an operator
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());

                switch (t) {
                    case "+":
                        stack.push(String.valueOf(b + a));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(b * a));
                        break;
                    case "/":
                        if (a == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }
        
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression");
        }

        return Integer.parseInt(stack.pop());
    }
}
