package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Mathematics_01247 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = 0;
		BigInteger compareNum = new BigInteger("0");
		
		for(int i = 0; i < 3; i++) {
			
			N = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			
			for(int j = 0; j < N; j++) {
				
				BigInteger num = new BigInteger(br.readLine());
								
				sum = sum.add(num);
			}
			
			if(sum.compareTo(compareNum) == 0) {
				sb.append("0\n");
			}
			if(sum.compareTo(compareNum) == 1) {
				sb.append("+\n");
			}
			if(sum.compareTo(compareNum) == -1) {
				sb.append("-\n");
			}
		}
		
		System.out.println(sb);
		br.close();
		
	}
}
