package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReversingString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		Stack<Character> chars = new Stack<Character>();
		for(char ch: nextLine.toCharArray()) {
			chars.push(ch);
		}
		while(!chars.isEmpty()) {
			System.out.print(chars.pop());
		}
		sc.close();
	}

}
