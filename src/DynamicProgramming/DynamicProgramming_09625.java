package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_09625 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] dpArray = new int[46][2];
		
		dpArray[0][0] = dpArray[1][1] = 1;
		dpArray[0][1] = dpArray[1][0] = 0;
		
		for(int i = 2; i <= n; i++) {
			dpArray[i][0] = dpArray[i-1][0] + dpArray[i-2][0];
			dpArray[i][1] = dpArray[i-1][1] + dpArray[i-2][1];
		}
		
		System.out.println(dpArray[n][0] + " " + dpArray[n][1]);
		br.close();
	}
}
