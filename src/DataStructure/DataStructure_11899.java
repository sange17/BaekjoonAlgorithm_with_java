package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DataStructure_11899 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(stack.size() == 0) {
				stack.push(c);
				continue;
			}
			
			if(stack.peek() == '(' && c == ')') {
				stack.pop();
				continue;
			}else {
				stack.push(c);
				continue;
			}
		}
		
		System.out.println(stack.size());
		br.close();
	}
}
