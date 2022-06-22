package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Geometry_03034 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n <= W || n <= H || n <= Math.sqrt(W * W + H * H)) {
				sb.append("DA").append("\n");
			}else {
				sb.append("NE").append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
