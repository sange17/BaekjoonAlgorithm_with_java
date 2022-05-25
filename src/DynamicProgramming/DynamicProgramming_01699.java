package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_01699 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dpArray = new int[100001];
		dpArray[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dpArray[i] = i;
			for(int j = 1; j*j <= i; j++) {
				dpArray[i] = Math.min(dpArray[i-(j*j)] + 1, dpArray[i]);
			}
		}
		
		System.out.println(dpArray[n]);
	}
}
