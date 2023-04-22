package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_01940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int left = 0;
		int right = N - 1;
		int count = 0;
		for(int i = 0; i < N; i++) {
			
			if(left >= right) break;
			
			if(array[left] + array[right] == M) {
				
				left++;
				right--;
				count++;
			}else if(array[left] + array[right] > M) {
				
				right--;
			}else if(array[left] + array[right] < M) {
				
				left++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
