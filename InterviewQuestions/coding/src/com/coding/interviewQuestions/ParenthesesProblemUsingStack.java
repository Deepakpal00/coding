package com.coding.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParenthesesProblemUsingStack {

	private static boolean checkParentheses(String parentheses) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < parentheses.length(); i++) {
			if (parentheses.charAt(i) == '{' || parentheses.charAt(i) == '[' || parentheses.charAt(i) == '(') {
				stack.add(parentheses.charAt(i));

			} else {
				if (!stack.isEmpty()) {
					if ((parentheses.charAt(i) == '}' && stack.peek() == '{')
							|| (parentheses.charAt(i) == ']' && stack.peek() == '[')
							|| (parentheses.charAt(i) == ')' && stack.peek() == '(')) {
						stack.pop();
					}
				} else {
					return false;
				}
			}

		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		String parentheses = "{[]()}";

		if (checkParentheses(parentheses)) {

			System.out.println("VALID");
		} else {
			System.out.println("NOT VALID");
		}
	}

}
