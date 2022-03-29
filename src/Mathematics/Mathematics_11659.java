package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_11659 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] array = new int[N+1];
		int sum = 0;
		
		array[0] = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) {
			array[i] = array[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum = array[b] - array[a-1];
			
			sb.append(sum).append("\n");
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
