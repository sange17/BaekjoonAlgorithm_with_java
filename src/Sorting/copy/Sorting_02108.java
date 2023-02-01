package Sorting.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_02108 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int n = Integer.parseInt(br.readLine());
		double sum = 0;
		long mean = 0;
		int mid = 0;
		int mode = 0;
		long range = 0;
		
		if(n % 2 == 0) System.exit(1);
		
		int array[] = new int[n];
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a > 4000 || a < -4000) System.exit(1);
			else {
				array[i] = a;
				sum += a;
			}
		}
		
		Arrays.sort(array);
		
		int cntArray[] = new int[8001];
		for(int i = 0; i < n; i++) {
			if(array[i] < 0) {
				cntArray[4000 - (array[i])]++;
			}else {
				cntArray[array[i]]++;
			}
		}
		
		int max = 0;
		for(int i = 0; i < 8001; i++) {
			if(max < cntArray[i]) {
				max = cntArray[i];
			}
		}
		
		int count = 0;
		for(int i = 0; i < 8001; i++) {
			if(cntArray[i] == max) {
				count++;
			}
		}
		
		int maxArray[] = new int[count];
		int j = 0;
		for(int i = 0; i < 8001; i++) {
			if(cntArray[i] == max) {
				if(i <= 4000) {
					maxArray[j] = i;
					j++;
				}else {
					maxArray[j] = 4000 - i;
					j++;
				}
			}
		}
		
		Arrays.sort(maxArray);
		
		mean = ((int)Math.round(sum / n));
		sb.append(mean).append("\n");
		
		mid = array[array.length / 2];
		sb.append(mid).append("\n");
		
		if(count == 1) {
			mode = maxArray[0];
		}else {
			mode = maxArray[1];
		}
		sb.append(mode).append("\n");
		
		range = array[array.length - 1] - array[0];
		sb.append(range);
		
		System.out.println(sb);
		br.close();
	}
}
