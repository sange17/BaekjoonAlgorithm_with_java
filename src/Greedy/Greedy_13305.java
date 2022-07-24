package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long[] distanceArray = new long[N-1];
		long[] oilPriceArray = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N-1; i++) {
			distanceArray[i] = Integer.parseInt(st.nextToken());
		}
		
		// 참고: 마지막 지역에 도착하면 끝이므로 마지막 지역의 기름가격은 필요없다.
		// 거리배열과 기름배열의 길이가 같다.
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			oilPriceArray[i] = Integer.parseInt(st.nextToken());
		}
		
		
		BigInteger sumOfOilPrice = BigInteger.valueOf(0);
		BigInteger minOilPrice = BigInteger.valueOf(oilPriceArray[0]);
		
		for(int i = 0; i < N-1; i++) {
			
			if(minOilPrice.compareTo(BigInteger.valueOf(oilPriceArray[i])) == 1) {
				minOilPrice = BigInteger.valueOf(oilPriceArray[i]);
			}
			
			sumOfOilPrice = sumOfOilPrice.add(minOilPrice.multiply(BigInteger.valueOf(distanceArray[i])));
		}
		
		System.out.println(sumOfOilPrice);
		
	}
}
