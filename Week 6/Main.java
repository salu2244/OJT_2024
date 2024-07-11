import java.util.Stack;

public class Question_5 {
    public int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t); // push to stack if it's a number
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int index = operators.indexOf(t);
                
                switch (index) {
                    case 0: // "+"
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1: // "-"
                        stack.push(String.valueOf(b - a));
                        break;
                    case 2: // "*"
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3: // "/"
                        if (a == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(String.valueOf(b / a));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + t);
                }
            }
        }
        
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression");
        }
        
        returnValue = Integer.parseInt(stack.pop());
        return returnValue;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        Question_5 q5 = new Question_5();
        int result = q5.evalRPN(tokens);
        System.out.println("Result: " + result); // Output: Result: 9
    }
}
