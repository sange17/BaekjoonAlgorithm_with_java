package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class DataStructure_03015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		for(int i = 0; i < N; i++) {
			stack1.push(Integer.parseInt(br.readLine())); 
		}
		
		int num = 0;
		int count = 0;
		
		while(!stack1.isEmpty()) {
			
			stack2.push(stack1.pop());
		}
		
		System.out.println(count);
		br.close();
	}
}
