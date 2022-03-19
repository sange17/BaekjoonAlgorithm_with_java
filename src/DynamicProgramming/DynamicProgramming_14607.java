package DynamicProgramming;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_14607 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger n = new BigInteger(br.readLine());
		
		System.out.println(n.multiply(n.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2)));
		
		br.close();
	}
}
