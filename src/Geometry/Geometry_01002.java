package Geometry;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

// 두 점 사이의 거리를 구해서 푸는 문제
// 처음에 Math.sqrt로 계산하려 했으나 소수점 계산 오류를 생각하지 못해 틀린 문제
public class Geometry_01002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int x1, y1, r1, x2, y2, r2;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			int distancePow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// 중점간 거리 distance의 제곱 
			 
			// 중점이 같고 반지름도 같을 경우
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				sb.append(-1 + "\n");
				continue;
			}
			
			// 두 원의 반지름 합보다 중점 간 거리가 더 길어 외접하지 않을 때
			else if(distancePow > Math.pow(r1 + r2, 2)) {
				sb.append(0 + "\n");
				continue;
			}
	 
			// 원 안에 원이 있으나 내접하지 않을 때 
			else if(distancePow < Math.pow(r2 - r1, 2)) {
				sb.append(0 + "\n");
				continue;
			}
			
			// 내접할 때 
			else if(distancePow == Math.pow(r2 - r1, 2)) {
				sb.append(1 + "\n");
				continue;
			}
	        
			// 외접할 때 
			else if(distancePow == Math.pow(r1 + r2, 2)) {
				sb.append(1 + "\n");
				continue;
			}
			
			// 두 원이 겹쳐져 두 점에서 만날 때
			else {
				sb.append(2 + "\n");
				continue;
			}
				
		}
		System.out.println(sb.toString());
		br.close();
	}
}
