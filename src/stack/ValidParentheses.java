package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String parentheses = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		for(char c: parentheses.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			if(c == ')' || c == '}'|| c == ']') {
				if(stack.isEmpty()) {
					System.out.println("Invalid");
					return;
				}
				char top = stack.peek();
				if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
					stack.pop();
				}else {
					System.out.println("Invalid");
					return;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		sc.close();
	}

}
