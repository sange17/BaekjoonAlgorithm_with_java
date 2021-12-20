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
		int cloneArray[] = new int[9]; 
		int sum = 0;
		int tmp = 0;
		int tmpj = 0;
		int tmpk = 0;
		
		for(int i = 0; i < 9; i++) {
			array[i] = Integer.parseInt(br.readLine());
			cloneArray[i] = Integer.parseInt(br.readLine());
			sum += array[i];
		}
		
		Arrays.sort(array);
		Arrays.sort(cloneArray);
		
		for(int j = 0; j < 9; j++) {
			array = cloneArray;
			tmp = sum;
			tmp -= array[j];
			for(int k = j+1; k < 9; k++) {
				array = cloneArray;
				tmp -= array[k];
				if(tmp == 100) {
					tmpk = k;
					break;
				}else {
					tmp += array[k];
				}
			}
			if(tmp == 100) {
				tmpj = j;
				break;
			}
		}
		
		for(int h = 0; h < 9; h++) {
			if(h == tmpj || h == tmpk) {
				continue;
			}else {
				sb.append(array[h]).append("\n");
			}
		}
		
		 System.out.println(sb);
	}
}
