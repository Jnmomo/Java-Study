import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the operation: ");
		String infix = scan.nextLine();
		System.out.println("Infix: " + infix);

		String[] parseInfix = infix.split(" ");
		String postfix = infixToPostfix(parseInfix);
		System.out.println("Postfix: " + postfix);

		String[] parsePostfix = postfix.split(" ");
		int result = calculator(parsePostfix);
		System.out.println("Result: " + result);
	}

	// create a method to convert infix to postfix notation:
	public static String infixToPostfix(String[] infix) {

		String postfix = "";
		Stack<String> operator = new Stack<String>();
		String popped;

		for (int i = 0; i < infix.length; i++) {
			String get = infix[i];

			if (!isOperator(get))
				postfix += get;
			else if (get == ")")
				while ((popped = operator.pop()) != "(")
					postfix += popped;
			else {
				while (!operator.isEmpty() && get != "(" && precedence(operator.peek()) >= precedence(get))
					postfix += operator.pop();

				operator.push(get);
			}
		}

		// pop any remaining operator:
		while (!operator.isEmpty())
			postfix += operator.pop();

		return postfix;
	}

	// create a method to decide whether the current char is an operator:
	public static boolean isOperator(String s) {
		return precedence(s) > 0;
	}

	// create a method to decide the precedence of operators:
	public static int precedence(String s) {
		if (s == "(" || s == ")")
			return 1;
		else if (s == "-" || s == "+")
			return 2;
		else if (s == "*" || s == "/")
			return 3;
		else
			return 0;
	}

	// create a method to calculate result based on postfix string passed in:
	public static int calculator(String[] postfix) {

		Stack<Integer> operands = new Stack<Integer>();

		for (int i = 0; i < postfix.length; i++) {
			switch (postfix[i]) {
			case "+":
			case "-":
			case "*":
			case "/":
				int right = operands.pop();
				int left = operands.pop();
				int value = 0;

				switch (postfix[i]) {
				case "+":
					value = left + right;
					break;
				case "-":
					value = left - right;
					break;
				case "*":
					value = left * right;
					break;
				case "/":
					value = left / right;
					break;
				default:
					break;
				}
				operands.push(value);
				break;

			default:
				operands.push(Integer.parseInt(postfix[i]));
				break;
			}
		}
		return operands.pop();
	}
}
