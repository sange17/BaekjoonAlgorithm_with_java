package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Geometry_17247 {
	
	static class Point {
		int x, y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int height = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		ArrayList<Point> array = new ArrayList<Point>();
		
		for(int i = 1; i <= height; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= width; j++) {
				int check = Integer.parseInt(st.nextToken());
				
				if(check == 1) {
					Point point = new Point(i, j);
					
					array.add(point);
				}
			}
		}
		
		int result = Math.abs((array.get(1).x - array.get(0).x)) + Math.abs((array.get(1).y - array.get(0).y));
		
		System.out.println(result);
		br.close();
	}
}
