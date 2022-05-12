package BruteForce;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_06603 {
	static int N;
	static int[] array;
	static boolean[] result;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			
			if(N == 0) break;
			
			array = new int[N];
			result = new boolean[N];
			
			for(int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0, 0);
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
	
	public static void dfs(int start, int depth) {
		if(depth == 6) {
			for(int i = 0; i < N; i++) {
				if(result[i]) sb.append(array[i] + " "); 
			}
			sb.append("\n");
		}
		
		for(int i = start; i < N; i++) {
			result[i] = true;
			dfs(i + 1, depth + 1);
			result[i] = false;
		}
	}
}
