package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BruteForce_10819 {
	static int N;
	static int[] array;
	static int[] nArray;
	static boolean[] visited;
	static int result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		array = new int[N];
		nArray = new int[N];
		visited = new boolean[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		result = 0;
		dfs(0);
		System.out.println(result);
	}
	
	public static void dfs(int count) {
		if(count == N) {
			int sum = 0;
			for(int i = 0; i < N - 1; i++) {
				sum += Math.abs(nArray[i] - nArray[i + 1]);
			}
			result = Math.max(result, sum);
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			
			visited[i] = true;
			nArray[count] = array[i];
			dfs(count + 1);
			visited[i] = false;
		}
	}
}
