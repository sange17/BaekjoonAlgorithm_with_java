package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_14659 {
	public static void main(String[] arsg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[N];
		for(int i = 0; i < N; i++){
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int count = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(array[i] > array[j]) {
					count++;
				}else {
					break;
				}
			}
			if(max < count) {
				max = count;
			}
			
			count = 0;
		}
		
		System.out.println(max);
		br.close();
	}
}
