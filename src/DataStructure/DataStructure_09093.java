package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_09093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		char stack[] = new char[20];
		int top = 0;
		
		for(int i = 0; i < n; i++) {
			char array[] = br.readLine().toCharArray();
			char result[] = new char[array.length+1];
			
			result[result.length - 1] = '#';
			for(int h = 0; h < result.length - 1; h++) {
				result[h] = array[h];
			}
			
			for(int j = 0; j < result.length; j++) {
				if(result[j] == ' ' || result[j] == '#') {
					for(int k = top-1; k >= 0; k--) {
						top--;
						sb.append(stack[k]);
					}
					sb.append(' ');
				}else {
					stack[top] = result[j];
					top++;
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
