package stack;

import java.util.Stack;

public class NextSmallerElementUsingStack {
	
	public static void nextSmaller(int[] a, int[] b) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = a.length - 1; i >= 0; i--) {
			while(!stack.isEmpty() && a[i] <= stack.peek()) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				b[i] = -1;
			}else {
				b[i] = stack.peek();
			}
			stack.push(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {4, 5, 2, 10, 8};
		int[] b = new int[a.length];
		
		nextSmaller(a, b);
		
		for(int i : b) {
			System.out.print(i + " ");
		}
		
	}

}
