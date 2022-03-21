package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DynamicProgramming_06571 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger[] array = new BigInteger[10000];
		int count = 0;
		
		array[1] = BigInteger.ONE;
		array[2] = BigInteger.ONE;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			BigInteger a = new BigInteger(st.nextToken());
			BigInteger b = new BigInteger(st.nextToken());
			
			if(a.compareTo(BigInteger.ZERO) == 0 && b.compareTo(BigInteger.ZERO) == 0) break;
			
			
			for(int i = 3; i <= b.intValue(); i++) {
				array[i] = array[i-1].add(array[i-2]);
				System.out.println(array[i] + " " + i);
			}
			
			for(int i = 1; i <= array.length; i++) {
				if(array[i].compareTo(a) >= 0 && array[i].compareTo(b) <= 0) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
