package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

// 사탕 개수의 합이 long형 범위를 넘어설 수 있다.
public class Mathematics_02547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long n = 0;
		for(int i = 0; i < T; i++) {
			
			br.readLine();
			
			n = Long.parseLong(br.readLine());
			
			BigInteger sum = new BigInteger("0");
			for(int j = 0; j < n; j++) {
				
				sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
			}
			
			if(sum.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
				
				sb.append("YES\n");
			}else {
				
				sb.append("NO\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
