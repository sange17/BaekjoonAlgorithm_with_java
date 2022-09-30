package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Greedy_02012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] array = new long[N + 1];
		
		for(int i = 1; i <= N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array);
		
		long count = 0;
		for(int i = 1; i <= N; i++) {	// 배열이 오름차순 정렬되어 있으므로 i가 등수가 된다. 
			// i는 현제 인덱스(실제 등수), array[i]는 예상한 등수
			if(array[i] < i) {
				count += Math.abs(i - array[i]);		// 정렬된 등수에서 실제 등수의 값이 예상한 등수보다 작은 경우
			}else {
				count += Math.abs(array[i] - i);		// 정렬된 등수에서 실제 등수의 값이 예상한 등수보다 큰 경우
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
