package BruteForce;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BruteForce_15666 {
	static int N, M;
	static int[] array;
	static int[] nArray;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		nArray = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			nArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nArray);
		
		dfs(0, 0);
		System.out.println(sb);
		br.close();
	}
	
	public static void dfs(int depth, int start) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(array[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int past = -1;
		for(int i = start; i < N; i++) {
			int now = nArray[i];
			if(past == now) {
				continue;
			}else {
				past = now;
				array[depth] = nArray[i];
				dfs(depth + 1, i);
			}
		}
	}
}
