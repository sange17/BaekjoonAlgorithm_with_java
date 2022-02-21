package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_09461 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long[] dpArray = new long[101];
		dpArray[1] = 1;
		dpArray[2] = 1;
		dpArray[3] = 1;
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			for(int j = 4; j <= N; j++) {
				dpArray[j] = dpArray[j-2] + dpArray[j-3];				
			}
			sb.append(dpArray[N]).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
