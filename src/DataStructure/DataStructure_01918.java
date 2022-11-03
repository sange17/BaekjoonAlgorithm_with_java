package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class DataStructure_01918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.next();
		int strLength = str.length();
		
		Stack<Character> stack = new Stack<Character>();
				
		char character;
		for(int i = 0; i < strLength; i++) {
			
			character = str.charAt(i);
			
			if(character >= 65 && character <= 90) {
				
				sb.append(character);
			}else {
				
				if(character == '+' || character == '-') {
					
					if(stack.isEmpty()) {
						
						stack.push(character);
					}else {
						
						if(stack.peek() == '*' || stack.peek() == '/') {
							sb.append(stack.pop());
							stack.push(character);
						}else {
							stack.push(character);
						}
					}
				}
				
				else if(character == '*' || character == '/') {
					
					if(stack.isEmpty()) {
						
						stack.push(character);
					}else {
						if(stack.peek() == '*' || stack.peek() == '/') {

							sb.append(stack.pop());
							stack.push(character);
						}else {
							
							sb.append(character);
							
						}
					}
				}
				
				else if(character == '(') {
					
					stack.push(character);
				}
				
				else if(character == ')') {
					
					while(stack.peek() != '(') {
						
						sb.append(stack.pop());
					}
					
					stack.pop();
				}
			}
		}
		
		while(!stack.isEmpty()) {
			
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
		sc.close();
	}
}
