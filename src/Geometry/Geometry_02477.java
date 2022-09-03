package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_02477 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int maxWidth = 0;
		int maxWidthIdx = 0;
		int maxHeight = 0;
		int maxHeightIdx = 0;
		int[] distanceArray = new int[8];
		
		StringTokenizer st;
		for(int i = 1; i < 7; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int direct = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());
			
			distanceArray[i] = distance;
			
			if(direct == 1 || direct == 2) {
				if(maxWidth < distance) {
					maxWidth = distance;
					maxWidthIdx = i;
				}
			}
			
			if(direct == 3 || direct == 4) {
				if(maxHeight < distance) {
					maxHeight = distance;
					maxHeightIdx = i;
				}
			}
		}
		
		distanceArray[0] = distanceArray[6];
		distanceArray[7] = distanceArray[1];
		
		int widthA = 0;
		int widthB = 0; 
		int shortWidth = 0; 
		int heightA = 0;
		int heightB = 0;
		int shortHeight = 0; 
		for(int i = 1; i < 7; i++) {
			if(distanceArray[i] == maxWidth && maxWidthIdx == i) {
				widthA = distanceArray[i-1];
				widthB = distanceArray[i+1];
				shortWidth = Math.abs(widthA - widthB);
			}
			if(distanceArray[i] == maxHeight && maxHeightIdx == i) {
				heightA = distanceArray[i-1];
				heightB = distanceArray[i+1];
				shortHeight = Math.abs(heightA - heightB);
			}
		}
		
		int result = (maxWidth * maxHeight - shortWidth * shortHeight) * K;
		
		System.out.println(result);
	}
}
