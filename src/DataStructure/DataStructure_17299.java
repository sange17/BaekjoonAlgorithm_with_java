package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataStructure_17299 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] countArray = new int[1000001];
		int[] numArray = new int[n];
		int[] stack = new int[n];
		int[] result = new int[n];
		int top = -1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			int A = Integer.parseInt(st.nextToken()); 
			countArray[A]++;
			numArray[i] = A;
		}
		
		
		for(int i = 0; i < n; i++) {
			while(top != -1 && countArray[numArray[top]] < countArray[numArray[i]]) {
				result[stack[top]] = numArray[i];
				top--;
			}
			top++;
			stack[top] = i;
		}
		
		if(top != -1) {
			for(int i = top; i >= 0; i--) {
				result[stack[i]] = -1;
			}			
		}
		
		for(int i = 0; i < n; i++) {
			sb.append(result[i]).append(" ");
		}
		
		System.out.println(sb);
		br.close();
	}
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
//public class Main {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] countArray = new int[1000001];
//		int[] numArray = new int[n];
//		Stack<Integer> stack = new Stack<>();
//		int[] result = new int[n];
//		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		for(int i = 0; i < n; i++) {
//			int A = Integer.parseInt(st.nextToken()); 
//			countArray[A]++;
//			numArray[i] = A;
//		}
//		
//		
//		for(int i = 0; i < n; i++) {
//			if(stack.isEmpty()) {
//				stack.push(i);
//			}
//			while(!stack.isEmpty() && countArray[numArray[stack.peek()]] < countArray[numArray[i]]) {
//				result[stack.pop()] = numArray[i];
//			}
//			stack.push(i);
//		}
//		
//		if(!stack.isEmpty()) {
//			while(!stack.isEmpty()) {
//				result[stack.pop()] = -1;
//			}			
//		}
//		
//		for(int i = 0; i < n; i++) {
//			sb.append(result[i]).append(" ");
//		}
//		
//		System.out.println(sb);
//		br.close();
//	}
//}
//
