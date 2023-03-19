package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BruteForce_03040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = 0;
		int sum = 0;
		int[] array = new int[9];
		for(int i = 0; i < 9; i++) {
			
			num = Integer.parseInt(br.readLine());
			
			array[i] = num;
			
			sum += num;
		}
		
		int temp = sum;
		int idxA = 0;
		int idxB = 0;
		for(int i = 0; i < 9; i++) {
			
			for(int j = i + 1; j < 9; j++) {
				
				if((temp - array[i] - array[j]) == 100) {
					
					idxA = array[i];
					idxB = array[j];
				}
			}
			
			temp = sum;
		}
		
		for(int i = 0; i < 9; i++) {
			
			if(array[i] == idxA) {
				
				continue;
			}else if(array[i] == idxB) {
				
				continue;
			}
			
			sb.append(array[i] + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
