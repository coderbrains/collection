package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String string = sc.nextLine();
//		
//		char[] charArray = string.toCharArray();
//		Stack<Character> characters = new Stack<Character>();
//		
//		int index = 0;
//		
//		while(index < charArray.length) {
//			characters.push(charArray[index]);
//			index++;
//		}
//		
//		index = 0;
//		while(index < charArray.length) {
//			System.out.print(characters.pop());
//			index++;
//		}
//		sc.close();
//	}
	
	//method 2:
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		Stack<Character> chars = new Stack<Character>();
		for(char c: string.toCharArray()) {
			chars.push(c);
		}
		while(!chars.isEmpty()) {
			System.out.print(chars.pop());
		}
		sc.close();
	}
	
}
