package Mathematics;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_16428 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		// q, r은 각각 몫과 나머지
		// A = qB + r
		
		System.out.println(A.divide(B));
		System.out.println(A.remainder(B));
	}

}
