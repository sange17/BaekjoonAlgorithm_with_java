package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Geometry_05073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int[] lengths = new int[3];
			
			for(int i = 0; i < 3; i++) {
				lengths[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(lengths);
			
			int a = lengths[0];
			int b = lengths[1];
			int c = lengths[2];		// 가장 긴 선분의 길이
			
			if(a == 0 || b == 0 || c == 0) {
				System.out.println(sb);
				break;
			}
						
			if(a + b <= c) {
				sb.append("Invalid").append("\n");
			} else {
				if(a == b && b == c) {
					sb.append("Equilateral").append("\n");
				}else {
					if((a == b && a != c) || (b == c && a != b) || (a == c && a != b)) {
						sb.append("Isosceles").append("\n");
					}else {
						if(a != b && b != c && a != c) {
							sb.append("Scalene").append("\n");
						}
					}
				}
			}
		}
	}
}
