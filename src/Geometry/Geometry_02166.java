package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_02166 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		long[] xArray = new long[N+1];
		long[] yArray = new long[N+1];
		long sumA = 0;
		long sumB = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			xArray[i] = Long.parseLong(st.nextToken());
			yArray[i] = Long.parseLong(st.nextToken());
		}
		
		xArray[N] = xArray[0];
		yArray[N] = yArray[0];
		
		// 신발끈 공식
		for(int i = 0; i < N; i++) {
			sumA += xArray[i] * yArray[i+1];
			sumB += xArray[i+1] * yArray[i];
		}
		
		System.out.println(String.format("%.1f", Math.abs(sumA - sumB) / 2.0));
		br.close();
	}
}
