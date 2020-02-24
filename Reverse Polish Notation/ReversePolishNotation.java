import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the operation: ");
		String infix = scan.nextLine();
		System.out.println("Infix: " + infix);

		String postfix = infixToPostfix(infix);
		System.out.println("Postfix: " + postfix);

		int result = calculator(postfix);
		System.out.println("Result: " + result);
	}

	// create a method to convert infix to postfix notation:
	public static String infixToPostfix(String infix) {

		String postfix = "";
		Stack<Character> operator = new Stack<Character>();
		char popped;

		for (int i = 0; i < infix.length(); i++) {
			char get = infix.charAt(i);

			// if it's a number, add to the result string:
			if (!isOperator(get))
				postfix += get;
			else if (get == ')')
				while ((popped = operator.pop()) != '(')
					postfix += popped;
			else {
				while (!operator.isEmpty() && get != '(' && precedence(operator.peek()) >= precedence(get))
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
	public static boolean isOperator(char i) {
		return precedence(i) > 0;
	}

	// create a method to decide the precedence of operators:
	public static int precedence(char i) {
		if (i == '(' || i == ')')
			return 1;
		else if (i == '-' || i == '+')
			return 2;
		else if (i == '*' || i == '/')
			return 3;
		else
			return 0;
	}

	// create a method to calculate result based on postfix string passed in:
	public static int calculator(String s) {
		Stack<Integer> operands = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '+':
			case '-':
			case '*':
			case '/':
				int right = operands.pop();
				int left = operands.pop();
				int value = 0;
				switch (s.charAt(i)) {
				case '+':
					value = left + right;
					break;
				case '-':
					value = left - right;
					break;
				case '*':
					value = left * right;
					break;
				case '/':
					value = left / right;
					break;
				}

				operands.push(value);
				break;

			default:
				operands.push(Character.getNumericValue(s.charAt(i)));
			}
		}
		return operands.pop();
	}
}
