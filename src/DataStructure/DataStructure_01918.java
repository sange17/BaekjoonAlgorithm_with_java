package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class DataStructure_01918 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.next();
		int strLength = str.length();
		
		Stack<Character> operatorStack = new Stack<Character>();
				
		char character;
		char top;
		for(int i = 0; i < strLength; i++) {
			
			character = str.charAt(i);
			
			// character가 연산자 또는 괄호일 때
			if(character == '+' || character == '-' || character == '*' || character == '/' || character == '(' || character == ')') {
				
				// 스택이 비어있을 때는 먼저 push하기
				if(operatorStack.isEmpty()) {
					operatorStack.push(character);
					
				}else {
					
					// 스택의 top과 character 비교해서 
					top = operatorStack.peek();
					
					if((top == '*' || top == '/') && (character == '+' || character == '-')) {
						
						sb.append(operatorStack.pop());
					}else {
						
						operatorStack.push(character);
					}
					
					if(character == ')') {
						
						operatorStack.pop();	// 닫힌 괄호 빼기
						
						while(operatorStack.peek() != '(') {
							
							sb.append(operatorStack.pop());
						}
						
						operatorStack.pop();	// 열린 괄호 빼기
						continue;
					}
					
//					while(!operatorStack.isEmpty()) {
//						
//						sb.append(operatorStack.pop());
//					}
				}
				
			}else {
				// character가 연산자 또는 괄호일 때
				sb.append(character);
			}		
		}
		
		System.out.println(sb);
		sc.close();
	}
}
