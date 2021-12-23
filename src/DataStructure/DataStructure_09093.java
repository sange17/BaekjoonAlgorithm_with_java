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
			
			for(int j = 0; j < array.length; j++) {
//				System.out.println(array[j]);
				if(array[j] == ' ' || array[j+1] == null) {
					for(int k = top-1; k >= 0; k--) {
						System.out.println(top);
						top--;
						sb.append(stack[k]);
					}
					sb.append(' ');
				}else {
					stack[top] = array[j];
					top++;
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
