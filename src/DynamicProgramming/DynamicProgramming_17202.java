package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_17202 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] aArray = br.readLine().split("");
		String[] bArray = br.readLine().split("");
		int[] abArray = new int[aArray.length * 2];
		int[][] dpArray = new int[abArray.length][abArray.length];
		
		for(int i = 0; i < aArray.length; i++) {
			abArray[i*2] = Integer.parseInt(aArray[i]);
			abArray[i*2+1] = Integer.parseInt(bArray[i]);
		}
		
		for(int i = 0; i < abArray.length; i++) {
			dpArray[0][i] = abArray[i];
		}
		
		for(int i = 1; i < abArray.length; i++) {
			for(int j = 1; j < abArray.length; j++) {
				int sum = dpArray[i-1][j] + dpArray[i-1][j-1];
				if(sum > 9) {
					dpArray[i][j] = sum - 10;
				}else {
					dpArray[i][j] = sum;
				}
			}
		}
		System.out.println(dpArray[abArray.length - 2][abArray.length - 2] + "" + dpArray[abArray.length - 2][abArray.length - 1]);
		br.close();
	}
}
