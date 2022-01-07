package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_09012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			char array[] = br.readLine().toCharArray();
			char stack[] = new char[array.length];
			int size = 0;
			
			for(int j = 0; j < array.length; j++) {
				if(size == 0) {
					stack[size] = array[j];
					size++;
				}else if(stack[size-1] == '(' && array[j] == ')'){
					stack[size-1] = '0';
					size--;
				}else if(stack[size-1] == '('&& array[j] == '(') {
					stack[size] = array[j];
					size++;
				}else if(stack[size-1] == ')') {
					stack[size] = array[j];
					size++;
				}
			}
			
			if(size == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
