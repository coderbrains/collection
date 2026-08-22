package stack;

public class NextGreaterElementProblem {
	
	public static void nextGreaterElement(int[] nos, int[] greaters) {
		
		for(int i = 0; i < nos.length; i++) {
			int data = nos[i];
			boolean flag = true;
			for(int j = i + 1; j < nos.length; j++) {
				if(data < nos[j]) {
					flag = false;
					greaters[i] = nos[j];
					break;
				}
			}
			if(flag)
			greaters[i] = -1;
		}
	}
	
	public static void nextSmallerElement(int[] nos, int[] nextSmaller) {
		for(int i = 0; i < nos.length; i++) {
			boolean flag = true;
			for(int j = i + 1; j < nos.length; j++) {
				if(nos[i] > nos[j]) {
					nextSmaller[i] = nos[j];
					flag = false;
					break;
				}
			}
			if(flag) {
				nextSmaller[i] = -1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {4, 5, 2, 10, 8};
		int[] greaters = new int[numbers.length];
		nextGreaterElement(numbers, greaters);
		for(int i : greaters) {
			System.out.print(i  + " ");
		}
		nextSmallerElement(numbers, greaters);
		System.out.println();
		for(int i : greaters) {
			System.out.print(i  + " ");
		}
		
	}

}
