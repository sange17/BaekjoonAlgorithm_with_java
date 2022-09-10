package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_01461 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());		// 책의 개수
		int M = Integer.parseInt(st.nextToken());		// 책을 들수 있는 개수
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			array[i] = num;
		}
		
		for(int i = 0; i < N - 1; i++) {
			int temp = 0;
			int min = array[i];
			
			for(int j = i + 1; j < N; j++) {
				if(Math.abs(array[j]) < Math.abs(array[i])) {
					min = array[j];
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < N; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
