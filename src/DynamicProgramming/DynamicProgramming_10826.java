package DynamicProgramming;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_10826 {
	static BigInteger[] dpArray;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0) {
			System.out.println(0);
		}else if(n == 1) {
			System.out.println(1);
		}else {
			dpArray = new BigInteger[n + 1];
			
			dpArray[0] = BigInteger.ZERO;
			dpArray[1] = BigInteger.ONE;
			for(int i = 2; i <= n; i++) {
				dpArray[i] = dpArray[i-1].add(dpArray[i-2]);
			}
			System.out.println(dpArray[n]);
		}
		br.close();
	}
	
}
