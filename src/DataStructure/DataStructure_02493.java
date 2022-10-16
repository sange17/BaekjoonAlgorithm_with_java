package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure_02493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stackA = new Stack<Integer>();
		Stack<Integer> stackB = new Stack<Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			stackA.push(Integer.parseInt(st.nextToken()));
		}
		
		while(!stackA.isEmpty()) {
			int currentNum = stackA.pop();
			
			if(stackA.peek() > currentNum) {
				sb.append(stackA.size());
				
			}else { 
				stackB.push(stackA.pop());
			}
			
			while(!stackB.isEmpty()) {
				stackA.push(stackB.pop());
				
			}
		}
		
		System.out.println(sb.reverse());
	}
}
