package stack;

import java.util.Stack;

public class NextGreaterUsingStack {
	
	public static void findNextGreater(int[] nos, int[] greaters) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = nos.length - 1; i >= 0; i--) {
			
				while(!stack.isEmpty() && nos[i] > stack.peek()) {
					stack.pop();
				}
				
				
				if(stack.isEmpty()) {
					greaters[i] = -1;
				}else {
					greaters[i] = stack.peek();
				}	
				stack.push(nos[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {4, 5, 2, 10, 8};
		int[] b = new int[a.length];
		findNextGreater(a, b);
		
		for(int i : b) {
			System.out.print(i + " ");
		}
	}

}
