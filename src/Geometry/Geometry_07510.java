package Geometry;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Geometry_07510 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[] array = new int[3];
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
						
			array[0] = Integer.parseInt(st.nextToken());
			array[1] = Integer.parseInt(st.nextToken());
			array[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(array);
			
			sb.append("Scenario #" + i + ":").append("\n");
			if((array[0] * array[0]) + (array[1] * array[1]) == (array[2] * array[2])) {
				sb.append("yes");
			}else {
				sb.append("no");
			}
			
			sb.append("\n\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
