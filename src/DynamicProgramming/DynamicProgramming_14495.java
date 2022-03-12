package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

public class DynamicProgramming_14495 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger[] dpArray = new BigInteger[117];
		
		dpArray[1] = BigInteger.ONE;
		dpArray[2] = BigInteger.ONE;
		dpArray[3] = BigInteger.ONE;
		
		for(int i = 4; i <= n; i++) {
			dpArray[i] = dpArray[i-1].add(dpArray[i-3]);
		}
		
		System.out.println(dpArray[n]);
		br.close();
	}
}
