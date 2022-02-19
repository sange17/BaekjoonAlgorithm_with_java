package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_01309 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		long[][] dpArray = new long[T+1][3];
		dpArray[1][0] = dpArray[1][1] = dpArray[1][2] = 1;
		
		for(int i = 2; i <= T; i++) {
			dpArray[i][0] = (dpArray[i-1][0] + dpArray[i-1][1] + dpArray[i-1][2]) % 9901;
			dpArray[i][1] = (dpArray[i-1][0] + dpArray[i-1][2]) % 9901;
			dpArray[i][2] = (dpArray[i-1][0] + dpArray[i-1][1]) % 9901;
		}
		
		long answer = (dpArray[T][0] + dpArray[T][1] + dpArray[T][2]) % 9901;
		System.out.println(answer);
		br.close();
	}
}
