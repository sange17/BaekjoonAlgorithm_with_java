package BruteForce;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

// ¿œ∞ˆ ≥≠¿Ô¿Ã πÆ¡¶
public class BruteForce_02309 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int array[] = new int[9];
		int sum = 0;
		int a = 0;
		int b = 0;
		int result = 0;
		
		for(int i = 0; i < 9; i++) {
			array[i] = Integer.parseInt(br.readLine());
			sum += array[i];
		}
		Arrays.sort(array);
		
		for(int j = 0; j < 8; j++) {			
			result = sum;
			result -= array[j];
			for(int k = j+1; k < 9; k++) {
				if(result - array[k] == 100) {
					a = j;
					b = k;
				}
			}
		}
		
		for(int m = 0; m < 9; m++) {
			if(m == a || m == b) {
				continue;
			}else {
				sb.append(array[m]).append('\n');				
			}
		}
		
		 System.out.println(sb);
	}
}
