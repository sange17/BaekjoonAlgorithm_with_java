package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_02132 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dpArray = new int[31];
		dpArray[0] = 1;
		dpArray[1] = 0;
		dpArray[2] = 3;
		
		for(int i = 3; i < n + 1; i++) {
			if(i % 2 != 0) {
				dpArray[i] = 0;				
			}else {
				dpArray[i] = dpArray[i-2] * dpArray[2];
				for(int j = i - 4; j >= 0; j-=2) {
					dpArray[i] += dpArray[j] * 2;
				}
			}
		}
		
		System.out.println(dpArray[n]);
		br.close();
	}
}
