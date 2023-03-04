package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_22938 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		long x1 = Long.parseLong(st.nextToken());
		long y1 = Long.parseLong(st.nextToken());
		long r1 = Long.parseLong(st.nextToken());
				
		st = new StringTokenizer(br.readLine(), " ");
		long x2 = Long.parseLong(st.nextToken());
		long y2 = Long.parseLong(st.nextToken());
		long r2 = Long.parseLong(st.nextToken());
		long width = 0;
		long height = 0;
		double distanceBetweenTwoPoints = 0;
		
		if(x1 > x2) {
			width = x1 - x2;
		}else {
			width = x2 - x1;
		}
		
		if(y1 > y2) {
			height = y1 - y2;
		}else {
			height = y2 - y1;
		}
		
		// 두 점 사이의 거리 구하기
		distanceBetweenTwoPoints = Math.sqrt((width * width) + (height * height));
		
		// 두 점 사이의 거리가 두 반지름의 길이의 합보다 크면 접하지 않고, 작으면 접한다.
		if((r1 + r2) > distanceBetweenTwoPoints) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		br.close();
	}
}
