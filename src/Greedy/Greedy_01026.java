package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Greedy_01026 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arrayA = new int[N];
		int[] arrayB = new int[N];
		
		StringTokenizer st;
	
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arrayA[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arrayB[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			result += (arrayA[i] * arrayB[N - i - 1]);
		}
		
		System.out.println(result);
		br.close();
	}
}
