package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_06322 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int TC = 0;
		
		StringTokenizer st;
		while(true) {
			TC++;
			
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
						
			if(a == 0 && b == 0 && c == 0) break;
			
			double result = 0;
			char type = ' ';
			if(a == -1) {
				if(c * c - b * b <= 0) {
					sb.append("Triangle #" + TC + "\n");
					sb.append("Impossible." + "\n\n");
					continue;
				}
				result = Math.sqrt(c * c - b * b) * 1000 / 1000;
				type = 'a';
			}else if(b == -1) {
				if(c * c - a * a <= 0) {
					sb.append("Triangle #" + TC + "\n");
					sb.append("Impossible." + "\n\n");
					continue;
				}
				result = Math.sqrt(c * c - a * a) * 1000 / 1000;
				type = 'b';
			}else if(c == -1) {
				result = Math.sqrt(a * a + b * b) * 1000 / 1000;
				type = 'c';
			}
			
			sb.append("Triangle #" + TC + "\n");
			sb.append(type +  " = " + String.format("%.3f", result) + "\n\n");
			
			
		}
		System.out.println(sb.toString());
		br.close();
	}
}
