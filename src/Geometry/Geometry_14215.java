package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Geometry_14215 {
	public static void main(String[] arsg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] lengthArray = new int[3];
		for(int i = 0; i < 3; i++) {
			int length = Integer.parseInt(st.nextToken());
			
			lengthArray[i] = length;
		}
		
		Arrays.sort(lengthArray);
		
		int result = 0;
		if(lengthArray[0] + lengthArray[1] <= lengthArray[2]) {
			int possibleLength = lengthArray[0] + lengthArray[1] - 1;
			result = lengthArray[0] + lengthArray[1] + possibleLength;
		}else {
			result = lengthArray[0] + lengthArray[1] + lengthArray[2];
		}
		
		System.out.println(result);
		br.close();
	}
}
