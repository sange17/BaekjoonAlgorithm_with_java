package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_17386 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		long x1 = Long.parseLong(st.nextToken());
		long y1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken());
		long y2 = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		long x3 = Long.parseLong(st.nextToken());
		long y3 = Long.parseLong(st.nextToken());
		long x4 = Long.parseLong(st.nextToken());
		long y4 = Long.parseLong(st.nextToken());
		
		int result = 0;
		
		
		if(CCW(x1, y1, x2, y2, x3, y3) * CCW(x1, y1, x2, y2, x4, y4) < 0 && 
				CCW(x1, y1, x3, y3, x4, y4) * CCW(x2, y2, x3, y3, x4, y4) < 0)
			result = 1;
		
		System.out.println(result);
	}
	
	public static int CCW(long x1, long y1, long x2, long y2, long x3, long y3) {
		return (x1*y2 + x2*y3 + x3*y1) - (y1*x2 + y2*x3 + y3*x1) < 0 ? 1 : -1;
	}
}
