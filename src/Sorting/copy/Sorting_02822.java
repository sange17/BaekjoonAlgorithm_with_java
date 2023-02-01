package Sorting.copy;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public class Sorting_02822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] array = new int[9];
		int[] idxArray = new int[5];
		
		int score = 0;
		int sum = 0;
		for(int i = 1; i <= 8; i++) {
			
			score = Integer.parseInt(br.readLine());
			
			map.put(score, i);
			array[i] = score;
		}
		
		// 전체 수 정렬
		Arrays.sort(array);
		
		int idx = 0;
		for(int i = 4; i < 9; i++) {
			
			sum += array[i];
			
			idxArray[idx] = map.get(array[i]);
			idx++;
		}
		
		// 뽑힌 수들의 인덱스 정렬
		Arrays.sort(idxArray);
		
		System.out.println(sum);
		
		for(int i = 0; i < 5; i++) {
			
			sb.append(idxArray[i] + " ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
