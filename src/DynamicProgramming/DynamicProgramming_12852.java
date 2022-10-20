package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_12852 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dpArray = new int[n+1];
		
		dpArray[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			dpArray[i] = dpArray[i-1] + 1;
			
			if(i % 2 == 0) {
				dpArray[i] = Math.min(dpArray[i], dpArray[i/2] + 1);
			}
			if(i % 3 == 0) {
				dpArray[i] = Math.min(dpArray[i], dpArray[i/3] + 1);
			}
		}
		
		System.out.println(dpArray[n]);
		br.close();
	}
}
