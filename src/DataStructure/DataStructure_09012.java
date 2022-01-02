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
				if(stack[j] == '(') {
					if(array[j+1] == ')') {
						stack[j] = 0;
						j++;
						size--;					
					}
				}else {
					stack[size] = array[j];
					size++;
				}
				System.out.println(size);
			}
			for(int j = 0; j < array.length; j++) {
				System.out.println(stack[j]);
			}
			if(size == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
