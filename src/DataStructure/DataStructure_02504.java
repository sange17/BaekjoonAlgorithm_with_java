package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class DataStructure_02504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<Character>();
		int count = 1;
		int answer = 0;
		boolean flag = true;
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			
			if(cur == '(') {
				stack.push(cur);
				count *= 2;
			}else if(cur == '[') {
				stack.push(cur);
				count *= 3;
			}else {
				if(cur == ')') {
					if(stack.isEmpty() || stack.peek() != '(') {
						flag = false;
						break;
					}
					if(str.charAt(i - 1) == '(') {
						answer += count;
					}
					stack.pop();
					count /= 2;
				}else if(cur == ']') {
					if(stack.isEmpty() || stack.peek() != '[') {
						flag = false;
						break;
					}
					if(str.charAt(i - 1) == '[') {
						answer += count;
					}
					stack.pop();
					count /= 3;
				}else {
					flag = false;
					break;
				}
			}
		}
		if(!flag || !stack.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(answer);
		}
	}
}
