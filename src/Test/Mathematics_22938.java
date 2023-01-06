package Test;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_22938 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int r1 = Integer.parseInt(st.nextToken());
				
		st = new StringTokenizer(br.readLine(), " ");
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		
		int width = Math.abs(x1 - x2);
		int height = Math.abs(y1 - y2);
		
		double betweenTwoPoint = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		
		if(r1 + r2 >= betweenTwoPoint) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		br.close();
	}
}
