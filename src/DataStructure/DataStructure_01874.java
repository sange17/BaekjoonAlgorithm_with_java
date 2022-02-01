package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DataStructure_01874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int stack[] = new int[n];
		int index = 0;
		int start = 0;
		
		while(n --> 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				for(int j = start + 1; j <= value; j++) {
					stack[index] = j;
					index++;
					sb.append("+").append("\n");
				}
				start = value;
			}else if(stack[index - 1] != value) {
				System.out.print("NO");
				return;
			}
			
			index--;
			sb.append("-").append("\n");
		}
		System.out.print(sb);
	}
}
