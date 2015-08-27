package prog.misc;

import java.util.Scanner;
import java.util.Stack;

public class StackWithMinMax {

	public Stack<Integer> minStack;
	public Stack<Integer> maxStack;	
	public Stack<Integer> regularStack;
	
	public final int MAX_INTEGER = -999;
	public final int MIN_INTEGER = 999;
	
	public StackWithMinMax(){
		minStack = new Stack<Integer>();
		maxStack = new Stack<Integer>();
		regularStack = new Stack<Integer>();
	}
	
	public void push(int value) {
		if (value <= min()) {
			minStack.push(value);
		}
		if (value >= max()){
			maxStack.push(value);
		}
		regularStack.push(value);
	}
	
	public int pop() {
		int value=0;
		if (!regularStack.isEmpty()) {
			value = regularStack.pop();
			if(value == minStack.peek()){
				return minStack.pop();
			}
			if (value == maxStack.peek()) {
				return maxStack.pop();
			}
			return value;
		}
		System.out.println("Nothing to pop ");
		return MIN_INTEGER;
	}
	
	public void peek() {
		if (!regularStack.isEmpty()) {
			System.out.println("Min value of stack : " +  minStack.peek());
			System.out.println("Max value of stack : " +  maxStack.peek());
		} else {
			System.out.println("Min value of stack : " +  MIN_INTEGER);
			System.out.println("Max value of stack : " +  MAX_INTEGER);
		}
	}
	

	private int max() {
		if(!maxStack.isEmpty()) {
			return maxStack.peek();
		} else {
			return MAX_INTEGER;
		}

	}

	private int min() {
		if(!minStack.isEmpty()) {
			return minStack.peek();
		} else {
			return MIN_INTEGER;
		}
	}

	public static void main(String[] args) {
		StackWithMinMax minMaxStack = new StackWithMinMax();
		System.out.println("Please enter \n1. Push \n2. Pop \n3. Display \n 0. Exit");
		Scanner in = new Scanner(System.in);		
		int choice = in.nextInt();
		while(choice != 0) {
			switch (choice) {
				case 1 : {
					System.out.println("Enter value to push : ");
					int value = in.nextInt();
					minMaxStack.push(value);
					break;				
				}
				case 2 : {
					System.out.println("Enter value to pop : ");
					minMaxStack.pop();
					break;	
				}
				case 3 : {
					minMaxStack.peek();
					break;
				}
				case 0 : {
					break;
				}
			}			
			System.out.println("Please enter \n1. Push \n2. Pop \n3. Display \n 0. Exit");
			choice = in.nextInt();
		}

	}

}
