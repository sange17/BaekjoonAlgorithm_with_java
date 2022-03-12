package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DynamicProgramming_06571 {
	static BigInteger zero = new BigInteger("0");
	static BigInteger one = new BigInteger("1");
	static BigInteger two = new BigInteger("2");
	
	public static int fib(BigInteger n) {
		if(n.compareTo(one) == 0) {
			return 1;
		}
		if(n.compareTo(two) == 0) {
			return 1;
		}
		return fib(n.subtract(one)) + fib(n.subtract(two));
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();
			
			BigInteger a = new BigInteger(st.nextToken());
			BigInteger b = new BigInteger(st.nextToken());
			
			if(a.compareTo(zero) == 0 && b.compareTo(zero) == 0) {
				
				break;
			}
			
			int count = 0;
			while(true) {
				if((a.compareTo(a) == 1 || a.compareTo(a) == 0) && (b.compareTo(b) == -1 || b.compareTo(b) == 0)) {
					count++;
				}
			}
			
		}
	}
}
