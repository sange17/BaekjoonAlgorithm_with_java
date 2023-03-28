package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_10474 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int numerator = 0;			// 분자
		int denominator = 0;		// 분모
		int integral = 0;			// 정수
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			numerator = Integer.parseInt(st.nextToken());
			denominator = Integer.parseInt(st.nextToken());
			
			if(numerator == 0 && denominator == 0) {	
				break;
			}
			
			integral = numerator / denominator;
			numerator = numerator % denominator;
			
			sb.append(integral + " " + numerator + " / " + denominator + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
