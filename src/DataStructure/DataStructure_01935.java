package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_01935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String array[] = br.readLine().split("");
		
		int numArray[] = new int[n];
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			numArray[i] = a;
		}
		
		int idx = 0;
		for(int i = 65; i < 65 + n; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == array[j].charAt(0)) {
					array[j] = Integer.toString(numArray[idx]);
				}
			}
			idx++;
		}
		
		double stack[] = new double[array.length];
		int size = 0;
		double result = 0;
		
		for(int i = 0; i < array.length; i++) {
			String ch = array[i];
			switch(ch) {
			case "*":
				result = (double)stack[size-2] * (double)stack[size-1];
				stack[size-2] = result;
				size -= 1;
				break;
			case "/":
				result = (double)stack[size-2] / (double)stack[size-1];
				stack[size-2] = result;
				size -= 1;
				break;
			case "+":
				result = (double)stack[size-2] + (double)stack[size-1];
				stack[size-2] = result;
				size -= 1;
				break;
			case "-":
				result = (double)stack[size-2] - (double)stack[size-1];
				stack[size-2] = result;
				size -= 1;
				break;
			default:
				stack[size] = Integer.parseInt(ch);
				size++;
				break;
			}
			
		}
		System.out.printf("%.2f", stack[0]);
		System.out.println();
		br.close();
	}
}
