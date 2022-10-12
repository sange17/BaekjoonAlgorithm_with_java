package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 삼각형의 닮음 공식 사용, 오차범위 10^-3이내가 되도록 이분 탐색 진행 
public class Geometry_02022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		
		double left = 0;
		double right = Math.min(x, y);
		
		while(right - left >= 0.001) {
			double width = (left + right) / 2;
			double h1 = Math.sqrt(Math.pow(x, 2) - Math.pow(width, 2));
			double h2 = Math.sqrt(Math.pow(y, 2) - Math.pow(width, 2));
			double result = (h1 * h2) / (h1 + h2);
			
			if(result >= c) left = width;
			else right = width;
		}
		
		System.out.println(String.format("%.3f", right));
		br.close();
	}
}
