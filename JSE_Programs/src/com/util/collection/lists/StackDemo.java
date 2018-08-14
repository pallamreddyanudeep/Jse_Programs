package com.util.collection.lists;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack<Integer> st=new Stack<>();
		stack_push(st);
		stack_peek(st);
		stack_pop(st);
		stack_push(st);
		stack_search(st, 3);
	}
	
	static void stack_push(Stack s) {
		for(int i=1;i<5;i++) {
			s.push(i);
		}
	}
	static void stack_pop(Stack s) {
		
		for(int i=1;i<5;i++) {
		int i1=(int)	s.pop();
		System.out.println(i1);
		}
	}
	static void stack_peek(Stack s) {
		System.out.println("peek is :" +s.peek());
	}
	static void stack_search(Stack s,Integer i) {
		
		System.out.println(s.search(i));
	}

}
