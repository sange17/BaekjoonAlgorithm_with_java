package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DynamicProgramming_11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int i_A = Integer.parseInt(a);
		int i_B = Integer.parseInt(b);
		int i_C = i_A - i_B;
		
		BigInteger b_A = new BigInteger(a);
		BigInteger b_B = new BigInteger(b);
		BigInteger b_C = b_A.subtract(b_B);
		BigInteger b_O = new BigInteger("1");
		
		for(int i = i_A; i > 1; i--) {
			b_A.multiply(b_A.subtract(b_O));
		}
	}
}
