package Geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Geometry_09063 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] X = new int[N];
		int[] Y = new int[N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			X[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(X);
		Arrays.sort(Y);
		
		System.out.println((X[N-1] - X[0]) * (Y[N-1] - Y[0]));
	}
}
