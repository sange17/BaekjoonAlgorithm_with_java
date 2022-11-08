package Geometry;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Geometry_16479 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int D1 = Integer.parseInt(st.nextToken());	// 윗변
		int D2 = Integer.parseInt(st.nextToken());	// 밑변
		double D3 = (D1 - D2) / 2.0;		 // 윗변에서 밑변을 뺀 너비의 절반의 너비
		double height = (K * K) - (D3 * D3);
		
		System.out.println(height);
		br.close();
	}
}
