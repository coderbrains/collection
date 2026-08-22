package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalanceP {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		//string for storing parentheses
		String string = sc.nextLine();
		for(char ch: string.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			if(ch == ')' || ch == '}' || ch == ']') {
				if(stack.isEmpty()) {
					System.out.println("Invalid");
					return;
				}
				char top = stack.pop();
				if((ch == ')' && top!= '(') || (ch == '}' && top!= '{') || (ch == ']' && top!= '[')) {
					System.out.println("invalid");
					return;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		sc.close();
	}

}
