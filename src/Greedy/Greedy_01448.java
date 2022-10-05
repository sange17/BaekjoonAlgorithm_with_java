package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Greedy_01448 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		// O(n)
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// 평균 : O(nlog(n)) / 최악 : O(n^2)
		Arrays.sort(array);
		
		int triangle = 0;
		int max = -1;
		
		// O(n)
		for(int i = N; i > 2; i--) {
			
			if(array[i - 2] + array[i -3] > array[i - 1]) {
				triangle = array[i - 1] + array[i - 2] + array[i -3];
				
				if(max < triangle) {
					max = triangle;
				}
				
			}
		}
		
		System.out.println(max);
	}
}
