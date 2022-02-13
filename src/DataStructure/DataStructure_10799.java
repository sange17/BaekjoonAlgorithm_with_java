package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class DataStructure_10799 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = br.readLine().split("");
		Stack<String> stack = new Stack<>();
		int answer = 0;
		
		for(int i = 0; i < array.length; i++) {
			String str = array[i];
			
			if(str.equals("(")) stack.push(str);
			else {
				stack.pop();
				if(array[i-1].equals("(")) {
					answer += stack.size();
				}else {
					answer++;
				}
			}
		}
		System.out.println(answer);
		br.close();
	}
}
