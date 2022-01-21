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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(array[i] < array[j]) {
					sb.append(array[j]).append(" ");
					break;
				}
				
				if(j == n - 1) {
					sb.append(-1).append(" ");
				}
			}
		}
		
		System.out.print(sb);
		br.close();
	}
}
