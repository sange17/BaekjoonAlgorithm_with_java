package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_09095 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int array[] = new int[11];
		
		array[1] = 1;
		array[2] = 2;
		array[3] = 4;
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			for(int j = 4; j <= m; j++) {
				array[j] = array[j-1] + array[j-2] + array[j-3];
			}			
			sb.append(array[m]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
