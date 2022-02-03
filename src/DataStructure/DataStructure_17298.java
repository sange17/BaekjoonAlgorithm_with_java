package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataStructure_17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int n = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		int stack[] = new int[n];
		int top = -1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			while(top != -1 && array[stack[top]] < array[i]) {
				array[stack[top]] = array[i];
				top--;
			}
			top++;
			stack[top] = i;
		}
		
		for(int i = top; i >= 0; i--) {
			array[stack[i]] = -1;
		}
		
		for(int i = 0; i < n; i++) {
			sb.append(array[i]).append(" ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
