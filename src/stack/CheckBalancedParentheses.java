package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalancedParentheses {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String chars = scr.nextLine();
		for(char ch: chars.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			if(ch == ')' || ch == '}' || ch == ']') {
				if(stack.isEmpty()) {
					System.out.println("ivalid");
					return;
				}
				char top = stack.pop();
				if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					System.out.println("Invalid");
					return;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("valid");
		}else {
			System.out.println("invalid. ");
		}
		scr.close();
	}
}
